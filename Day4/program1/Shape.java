package Day4.program1;

public abstract class Shape {
  protected String name;
  Shape(String name){
	  
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  abstract float calculateArea();
}
