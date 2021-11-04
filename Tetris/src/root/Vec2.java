package root;

public class Vec2 {
	private int x, y;
	
	public Vec2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2(Vec2 vec) {
		x = vec.getX();
		y = vec.getY();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2 add(Vec2 vec) {
		x+=vec.getX();
		y+=vec.getY();
		return this;
	}
	
	public Vec2 sub(Vec2 vec) {
		x-=vec.getX();
		y-=vec.getY();
		return this;
	}
}
