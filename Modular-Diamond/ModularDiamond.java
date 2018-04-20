import java.util.Scanner;

public class ModularDiamond {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of diamond: ");
		int num = scan.nextInt();
		int row = num * 2 - 1;
		int column = row;
		String[][] dPattern = new String[row][column];

		//QuadrantOne(dPattern);
		QuadrantTwo(dPattern);
		//QuadrantThree(dPattern);
		QuadrantFour(dPattern);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (dPattern[i][j] == null)
					System.out.print("\t");
				else
					System.out.print(dPattern[i][j]);
			}
			System.out.println();
		}

		scan.close();
	}

	public static void QuadrantOne(String quadrant[][]) {
		for (int rows = 0; rows <= quadrant[0].length / 2; rows++) {
			for (int cols = quadrant[0].length - 1; cols >= quadrant[0].length / 2; cols--) {
				if (rows == quadrant[0].length / 2 || cols == quadrant[0].length / 2 || cols == quadrant[0].length / 2 + rows)
					quadrant[rows][cols] = "*\t";
				else
					quadrant[rows][cols] = "\t";

			}
		}
	}

	public static void QuadrantTwo(String quadrant[][]) {
		for (int rows = 0; rows <= quadrant[0].length / 2; rows++) {
			for (int cols = 0; cols <= quadrant[0].length / 2; cols++) {
				if (rows == quadrant[0].length / 2 || cols == quadrant[0].length / 2 || cols == quadrant[0].length / 2 - rows)
					quadrant[rows][cols] = "*\t";
				else
					quadrant[rows][cols] = "\t";
			}
		}
	}

	public static void QuadrantThree(String quadrant[][]) {
		for (int rows = quadrant[0].length / 2; rows < quadrant[0].length; rows++) {
			for (int cols = 0; cols <= quadrant[0].length / 2; cols++) {
				if (rows == quadrant[0].length / 2 || cols == quadrant[0].length / 2 || rows == cols + quadrant[0].length / 2)
					quadrant[rows][cols] = "*\t";
				else
					quadrant[rows][cols] = "\t";

			}
		}
	}

	public static void QuadrantFour(String quadrant[][]) {
		for (int rows = quadrant[0].length / 2; rows < quadrant[0].length; rows++) {
			for (int h = 1, cols = quadrant[0].length / 2; cols <= quadrant[0].length - 1; cols++, h++) {
				if (rows == quadrant[0].length / 2 || cols == quadrant[0].length / 2 || rows == quadrant[0].length - h)
					quadrant[rows][cols] = "*\t";
				else
					quadrant[rows][cols] = "\t";
			}
		}
	}
}
