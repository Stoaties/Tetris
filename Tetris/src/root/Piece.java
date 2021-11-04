package root;

public class Piece {
	private int[][] shape;
	private boolean isFixed = false;
	private Vec2 pos; //Position a partir du haut gauche, commence a [0,0]
	
	public Piece(PieceType type) {
		shape = type.getShape();
	}
	
	public Piece(int[][] shape) {
		this.shape = shape;
	}
	
	public Piece() {
		
	}
	
	
	public boolean isColliding(Piece piece) {
		for(int i = 0; i < shape.length; i++) {
			for(int j = 0; j < shape[i].length; j++) {
				Vec2 trueCoord = new Vec2(pos.getX()+i, pos.getY()+j);
				
				if(shape[i][j] == 1) {
					if(true) {
						
					}
				}
			}
		}
		
		return isFixed;
		
	}
	
	public int[][] getShape(){
		return shape;
	}
	
	public boolean isFixed() {
		return isFixed;
	}
	
	public Vec2 getPos() {
		return pos;
	}
}
