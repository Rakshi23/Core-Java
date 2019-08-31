//Example of MULTIPLE INHERITANCE using multiple interfaces
package inheritanceofinterface;

interface Motorbike
{
	int speed = 50;
	public void totalDistance();
}

interface Cycle
{
	int distance = 150;
	public void speed();
}
		
public class TwoWheeler implements Motorbike, Cycle
{
			int totalDistance;
			int avgSpeed;
			public void totalDistance()
			{
				totalDistance = speed*distance;
				System.out.println("total Distance Travelled: "+totalDistance);
			}
			public void speed()
			{
				int avgSpeed = totalDistance/speed;
				System.out.println("Average Speed maintained:"+avgSpeed);
			}
			public static void main(String[] args)
			{
				TwoWheeler t1 = new TwoWheeler();
				t1.totalDistance();
				t1.speed();
			}
}




	


