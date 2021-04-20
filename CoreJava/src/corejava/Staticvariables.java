package corejava;

public class Staticvariables {

	
	String name; //instance variables
	int rollnum;
	static String address  = "Bangalore"; //as it is remaining same and to avoid memory creation each time an object is created
	static int i=0;
	static int a,b;
	static{ //static block
		a=2;
		b=4;
	}
	
	Staticvariables(String name, int rollnum)
	{
		this.name =name;
		this.rollnum=rollnum;
		i++;
		System.out.println(i); //this will print 2 because acting on same variable ,if i is not declared static it would always return 1 ad it is an instance variable,becuase it will not remember what other object manipulated
		System.out.println(name);
	}
	 
	public void getAddress()
	{
		System.out.println(name+""+address);
	}
	public static void def() {
		System.out.println(i);
	}
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Staticvariables st =new Staticvariables("Sirisha",4);
		Staticvariables st1 =new Staticvariables("Tanuja",5);
		st.getAddress();//to call static methods we use objname.methodname
		def();
		Staticvariables.i=8; //to assign value to static variable we use classname.variablename
		Staticvariables.def();//to call static methods we use classname.methodname
		st.rollnum=9;//to assign value to instant variable we use objname.variablename
		FinalDemo f= new FinalDemo();
		f.getData();
	}

}
