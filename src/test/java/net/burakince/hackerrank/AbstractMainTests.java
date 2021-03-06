package net.burakince.hackerrank;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMainTests {
	private static final PrintStream OUT = System.out;
	private static final PrintStream ERR = System.err;

	private static void recoverOriginalOutput() {
		System.err.flush();
		System.out.flush();

		System.setOut(AbstractMainTests.OUT);
		System.setErr(AbstractMainTests.ERR);
	}

	public static String[] executeMain(String className, String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		PrintStream tempOutput = new PrintStream(bos, true);
		System.setOut(tempOutput);
		System.setErr(tempOutput);

		List<String> result = new ArrayList<String>();
		try {
			AbstractMainTests.invokeMain(className, args);
			BufferedReader reader = new BufferedReader(new StringReader(bos.toString()));
			String line = reader.readLine();
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
		} catch (Throwable e) {
			throw new RuntimeException("Error obtaining output for [" + className + "]", e);
		} finally {
			recoverOriginalOutput();
			try {
				bos.close();
				tempOutput.close();
			} catch (IOException e) {
			}
		}
		return result.toArray(new String[0]);
	}

	public static void invokeMain(String test, String[] args) {
		try {
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName(test);
			Object app = clazz.newInstance();
			Method m = app.getClass().getMethod("main", (new String[0]).getClass());

			if ((m.getReturnType() != Void.TYPE) || (!Modifier.isStatic(m.getModifiers()))) {
				throw new RuntimeException("Not executable found: static main(String[])");
			}
			Object[] param = { args };
			m.invoke(app, param);
		} catch (Throwable e) {
			throw new RuntimeException("Error executing main", e);
		}
	}
}
