
public class SoftwareList {
	protected SoftwareList(){
	}
	
	/**This main method creates the object of classes in sun and oracle packages and access its methods.*/
	public static void main(String[] args) {
		sun.Softwares objSun = new sun.Softwares();
		objSun.listSoftware();
		oracle.Softwares objOracle = new oracle.Softwares();
		objOracle.printSoftware();
	}

}
