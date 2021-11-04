package root;

public enum PieceType {
	LPiece(new int[][]{{0,0,1},{1,1,1}}),
	TPiece(new int[][]{{0,1,0},{1,1,1}}),
	JPiece(new int[][]{{1,0,0},{1,1,1}}),
	IPiece(new int[][]{{1,1,1,1}}),
	OPiece(new int[][]{{1,1},{1,1}}),
	SPiece(new int[][]{{0,1,1},{1,1,0}}),
	ZPiece(new int[][]{{1,1,0},{0,1,1}})
	;
	
	private int[][] shape;

	PieceType(int[][] shape) {
		this.shape=shape;
	}
	
	public int[][] getShape(){
		return shape;
	}


}
