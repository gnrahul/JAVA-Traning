package dayfive;

public class Base {
	//Declaring default, PVT & Protected types
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//declaring method for default,public, PVT,Protected
	
	void methodDefault() {
		System.out.println("Default Access Base class");
		System.out.println("Default variable:" +varDefault);
	}
	void methodPublic() {
		System.out.println("Public Access Base class");
		System.out.println("Public variable:" +varPublic);
	}
	void methodPrivate() {
		System.out.println("Private Access Base class");
		System.out.println("Private variable:" +varPrivate);
	}
	void methodProtected() {
		System.out.println("Protected Access Base class");
		System.out.println("Protected variable:" +varProtected);
	}
	

}
