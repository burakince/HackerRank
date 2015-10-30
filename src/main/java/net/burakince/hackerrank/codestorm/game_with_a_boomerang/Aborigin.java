package net.burakince.hackerrank.codestorm.game_with_a_boomerang;

public class Aborigin {

	private int[] values;
	private int size;
	private int current = 0;

	public Aborigin(int size) {
		values = new int[size];
		this.size = size;
		for (int i = 0; i < size; i++) {
			values[i] = i + 1;
		}
	}

	public int size() {
		return size;
	}

	public void throwBoomerang() {
		if (isEven()) {
			int mid = size / 2;
			if ((current + 1) > mid) {
				int leftSide = current - mid;
				remove(leftSide);
				if (leftSide > current) {
					current++;
				}
			} else {
				remove(mid + current);
				current++;
			}
		} else {
			remove(current);
		}
		if (current >= size) {
			current = 0;
		}
	}

	protected void remove(int index) {
		int[] newValues = new int[--size];
		if (index == 0) {
			System.arraycopy(values, 1, newValues, 0, size);
		} else if (index == (size)) {
			System.arraycopy(values, 0, newValues, 0, size);
		} else {
			int first = index;
			int second = size - first;
			System.arraycopy(values, 0, newValues, 0, first);
			System.arraycopy(values, first + 1, newValues, first, second);
		}
		values = newValues;
	}

	private boolean isEven() {
		return size % 2 == 0;
	}

	protected int[] getValues() {
		return values;
	}

	public int lastAborigin() {
		return values[0];
	}

}
