package sun;
/** * This class demonstrates the use of packages.
 */
public class Softwares {
	/** * Constructor.*/
	public Softwares(){
	}
	/** This method contains a list of softwares.*/
	public final void listSoftware()
	{
		int i;
		String []arrSun = {"JCreator", "JBuilder", "Jacobe"};
		for(i = 0;i < 3; i++)
		{
			System.out.println(arrSun[i]);
		}
	}
}
