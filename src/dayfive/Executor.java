package dayfive;

public class Executor {

	public static void main(String[] args) {
		//Accessing same package class using Object
		Base b1=new Base(); 
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//Private Member accessing
		
		/*b1.varPrivate=21;
		b1.methodPrivate();*/
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		
		//Instance Operator
		System.out.println(b1.instance);

		
		
	}

}
