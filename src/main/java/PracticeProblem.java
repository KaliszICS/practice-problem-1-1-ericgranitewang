public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] amogus) {
		//Write question 1 code here
		int count = 0; 
		for (int i = 0; i < amogus.length; i++) {
			for (int j = 0; j < amogus[i].length; j++) {
				count += amogus[i][j];
			}
		}
		return count;
	}

	public static int sumRow(int[][] amogus, int row) {
		//Write question 2 code here
		int count = 0;
		for (int i = 0; i < amogus[row].length; i++) {
			count += amogus[row][i];
		}
		return count;
	}

	public static int sumColumn(int[][] amogus, int col) {
		//Write question 3 code here
		int count = 0;
		for (int i = 0; i < amogus.length; i++) {
			count += amogus[i][col];
		}
		return count;
	}

}
