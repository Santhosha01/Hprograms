package Day4.program1;

public class Rectangle extends Shape{

	private int length;
	private int breadth;
	Rectangle(String name,int length,int breadth){
		super(name);
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	float calculateArea() {
		float area=length*breadth;
		return area;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	

}
