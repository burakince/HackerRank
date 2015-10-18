package net.burakince.hackerrank.testing_volume;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate {

	public static final Calculate output = new Calculate();
	private Scanner in;

	public Calculate() {
		in = new Scanner(System.in);
	}

	public int getINTVal() throws IOException {
		return Integer.parseInt(in.nextLine());
	}

	public double getDoubleVal() {
		return Double.parseDouble(in.nextLine());
	}

	public static Calculate get_Vol() throws IOException {
		return output;
	}

	public double main(int a) {
		if (a <= 0) {
			exception();
		}
		return a*a*a;
	}

	public double main(int l, int b, int h) {
		if (l <= 0 || b <= 0 || h <= 0) {
			exception();
		}
		return l * b * h;
	}

	public double main(double r) {
		if (r <= 0) {
			exception();
		}
		return (2 * Math.PI * Math.pow(r, 3)) / 3;
	}

	public double main(double r, double h) {
		if (r <= 0 || h <= 0) {
			exception();
		}
		return Math.PI * r * r * h;
	}

	private void exception() {
		throw new NumberFormatException("All the values must be positive");
	}

	public void display(double volume) {
		System.out.printf("%.3f\n", volume);
	}
	
}

public class Solution {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.getINTVal();
			while (T-- > 0) {
				double volume = 0.0d;
				int ch = cal.getINTVal();
				if (ch == 1) {
					int a = cal.getINTVal();
					volume = Calculate.get_Vol().main(a);
				} else if (ch == 2) {
					int l = cal.getINTVal();
					int b = cal.getINTVal();
					int h = cal.getINTVal();
					volume = Calculate.get_Vol().main(l, b, h);
				} else if (ch == 3) {
					double r = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r);
				} else if (ch == 4) {
					double r = cal.getDoubleVal();
					double h = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r, h);
				}
				cal.output.display(volume);
			}

		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

}

class Do_Not_Terminate {
	 
    @SuppressWarnings("serial")
	public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
