package inheritanceofinterface;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double r)
	{
		this.radius = r;
	}

	@Override
	public void draw() {
		System.out.println("drawing Circle");
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}

	

}
