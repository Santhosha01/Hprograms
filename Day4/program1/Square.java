package Day4.program1;

public class Square extends Shape{

	private int side;
	Square(String name,int side){
		super(name);
		this.side=side;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	float calculateArea() {
		return side*side;
	}

}
