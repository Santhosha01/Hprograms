package Day4.program1;

public class Circle extends Shape{

	private int radius;
	
	Circle(String name,int radius){
		super(name);
		this.radius=radius;
	}
	@Override
	float calculateArea() {
		float area=(float) (3.14*radius*radius);
		return area;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
