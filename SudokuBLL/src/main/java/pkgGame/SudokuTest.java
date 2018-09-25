package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {

	
	@Test
	public void getPuzzle_test1() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 }};

		Sudoku sud = new Sudoku(arr1);


		assertTrue(Arrays.equals(arr1, sud.getPuzzle()));

	}
	@Test
	public void getPuzzle_test2() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 }};

		Sudoku sud = new Sudoku(arr1);
		int[][] arr2 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 }};
		arr2[0][0] = 2;

		assertFalse(Arrays.equals(arr2, sud.getPuzzle()));

	}
	@Test
	public void getRegion_test1() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		int[] arr1Test = { 0, 1, 2, 10, 11, 12, 20, 21, 22 };

		Sudoku sud = new Sudoku(arr1);

		// String intArrayString = Arrays.toString(sud.getRegion(1));
		// System.out.println(intArrayString);

		assertTrue(Arrays.equals(sud.getRegion(0), arr1Test));

	}

	@Test
	public void getRegion_test2() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		int[] arr1Test = { 36, 37, 38, 46, 47, 48, 56, 57, 58 };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(Arrays.equals(sud.getRegion(5), arr1Test));

	}

	@Test
	public void getRegion_test3() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		int[] arr1Test = { 36, 37, 38, 46, 47, 48, 56, 57, 2 };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(Arrays.equals(sud.getRegion(5), arr1Test));

	}

	@Test
	public void getRegion_test4() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		int[] arr1Test = { 0, 1, 2, 10, 11, 12, 20, 21, 22 };

		Sudoku sud = new Sudoku(arr1);

		// String intArrayString = Arrays.toString(sud.getRegion(1));
		// System.out.println(intArrayString);

		assertTrue(Arrays.equals(sud.getRegion(1, 1), arr1Test));

	}

	@Test
	public void getRegion_test5() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		int[] arr1Test = { 36, 37, 38, 46, 47, 48, 56, 57, 58 };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(Arrays.equals(sud.getRegion(8, 3), arr1Test));

	}

	@Test
	public void isPartialSudoku_test1() {

		int[][] arr1 = { { 9, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test2() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test3() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test4() {

		int[][] arr1 = { { 1, 4, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test5() {

		int[][] arr1 = { { 1, 2, 0, 2 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test6() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 2, 4, 1, 0 }, { 0, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test7() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isPartialSudoku_test8() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 }, { 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isPartialSudoku());

	}

	@Test
	public void isValidValue_test1() {

		int[][] arr1 = { { 9, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(sud.isValidValue(0, 0, 0));

	}

	@Test
	public void isValidValue_test2() {

		int[][] arr1 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
				{ 40, 41, 42, 43, 44, 45, 46, 47, 48 }, { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
				{ 60, 61, 62, 63, 64, 65, 66, 67, 68 }, { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
				{ 80, 81, 82, 83, 84, 85, 86, 87, 88 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isValidValue(0, 0, 9));

	}

	@Test
	public void isisValidValue_test3() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(sud.isValidValue(0, 1, 3));

	}

	@Test
	public void isValidValue_test4() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isValidValue(3, 0, 3));

	}

	@Test
	public void isValidValue_test5() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 2, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isValidValue(3, 0, 2));

	}

	@Test
	public void isValidValue_test6() {

		int[][] arr1 = { { 1, 2, 0, 0 }, { 0, 4, 1, 0 }, { 0, 0, 0, 3 }, { 4, 0, 0, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isValidValue(0, 1, 2));

	}

	@Test
	public void isSudoku_test1() {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };

		Sudoku sud = new Sudoku(arr1);

		assertTrue(sud.isSudoku());

	}

	@Test
	public void isSudoku_test2() {

		int[][] arr1 = { { 0, 2, 3, 4 }, { 3, 4, 0, 2 }, { 2, 0, 4, 3 }, { 4, 3, 2, 0 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isSudoku());

	}

	@Test
	public void isSudoku_test3() {

		int[][] arr1 = { { 1, 2, 3, 2 }, { 3, 2, 1, 2 }, { 2, 1, 2, 3 }, { 2, 3, 2, 1 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isSudoku());

	}

	@Test
	public void isSudoku_test4() {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isSudoku());

	}

	@Test
	public void isSudoku_test5() {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 2, 1, 4, 3 }, { 3, 4, 1, 2 }, { 4, 3, 2, 1 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isSudoku());

	}

	@Test
	public void isSudoku_test6() {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 2, 1, 4, 3 }, { 3, 4, 1, 2 }, { 4, 3, 2, 1 }, { 5 } };

		Sudoku sud = new Sudoku(arr1);

		assertFalse(sud.isSudoku());
	}
}
	
	
	
}
