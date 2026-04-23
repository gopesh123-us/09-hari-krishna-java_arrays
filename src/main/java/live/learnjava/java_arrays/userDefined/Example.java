package live.learnjava.java_arrays.userDefined;

public class Example {
	private int x;
	private int y;
	
	public Example() {
		
	}
	
	public Example(int theX, int theY) {
		this.x = theX;
		this.y = theY;
	}
	
	public int getX() {
		return this.x;		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x:"+this.x + "|" + "y:"+this.y;
	}
	
}
