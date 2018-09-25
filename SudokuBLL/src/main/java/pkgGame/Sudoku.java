package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {	

	private int iSize;	// width/height of the Sudoku puzzle
	private int iSqrtSize; // SquareRoot of the iSize. If the iSize = 9, iSqrtSize = 3

/*	public Sudoku() {
		super();
		  Auto-generated constructor stub
	}*/

	public Sudoku(int[][] puzzle) {
		super.setLatinSquare(puzzle);
		iSize = super.getLatinSquare().length;
		iSqrtSize = (int) Math.sqrt(super.getLatinSquare().length);

	}

	public int[][] getPuzzle() {
		return super.getLatinSquare();
	}

	public int[] getRegion(int iCol, int iRow) { // region based on iCol and iRow
		int[] reg = new int [iSize];
		
		int r = ((iRow/iSqrtSize) * iSqrtSize) + (iCol/iSqrtSize);
		
		int i = ( r % iSqrtSize)* iSqrtSize;
		int j = (r / iSqrtSize)* iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int count=0;
		
		for (; j<jMax ; j++) {
			for (i=(r% iSqrtSize)* iSqrtSize ; i<iMax;i++) {
				reg[count++]= super.getLatinSquare()[j][i];
			}
		}
		return reg;
	}
	
	public int[] getRegion(int r) { // pass in a given region, get back a 1-dim array of region
		int[] reg = new int [iSize];
		
		int i = ( r % iSqrtSize)* iSqrtSize;
		int j = (r / iSqrtSize)* iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int count=0;
		
		for (; j<jMax ; j++) {
			for (i=(r% iSqrtSize)* iSqrtSize ; i<iMax;i++) {
				reg[count++]= super.getLatinSquare()[j][i];
			}
		}
		return reg;
		
		
		 // 1-dim array from given region
		
	}
	
	public boolean isPartialSudoku() { // return true if it's a LatinSquare, if each element in first row is in each region, if there is at least one zero
		boolean isPartialSudoku = true;
		
		for (int i = 0; i<super.getLatinSquare().length; i++)
		if (super.getLatinSquare()[i].length != super.getLatinSquare().length)
			return false;
		
		for (int i = 1; i < iSize; i++) {
			if (iSize != super.getLatinSquare()[i].length) {
				return false;
			}
		}
		
		
		for (int i = 0; i < iSize; i++) {
			if (hasDuplicates(super.getRow(i)))
				return false;
		}

		for (int j = 0; j < iSize; j++) {
			if (hasDuplicates(super.getColumn(j)))
				return false;
		}
		
		for (int k = 0; k < iSize; k++) {
			if (hasDuplicates(getRegion(k)))
				return false;
		}
		
		if (!super.ContainsZero())
			isPartialSudoku = false;
		
		
		return isPartialSudoku;
	}
	

		


public boolean isSudoku() { // is a partial sudoku and has no zeros
	boolean isSudoku = true;
	for (int i = 0; i<super.getLatinSquare().length; i++)
	if (super.getLatinSquare()[i].length != super.getLatinSquare().length)
		return false;
	
	if (!super.isLatinSquare())
		return false;
	
	for (int i = 0; i < iSize; i++) {
		if (super.hasDuplicates(getRegion(i)))
			return false;
	}
	
	for (int j = 1; j < iSize; j++) {

		if (!super.hasAllValues(getRegion(0), getRegion(j))) {
			return false;
		}
	}
	
	if (super.ContainsZero())
		return false;
	
	
	return isSudoku; //TODO
}


public boolean isValidValue(int iCol, int iRow, int iValue) {
	int[][] holdArray = Arrays.copyOf(super.getLatinSquare(), iSize);
	holdArray[iRow][iCol] = iValue;
	Sudoku sd = new Sudoku(holdArray);
	return sd.isPartialSudoku() || sd.isSudoku();
}
}




