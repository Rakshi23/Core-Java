package inheritanceofinterface;

public interface Shape {
	
	//implicitly public, static, final
	public String LABLE = "Shape";
	
	//interface methods are implicitly abstract and public
	void draw();
	
	double getArea();

}
