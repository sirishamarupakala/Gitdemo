package corejava;

public class ChildClass extends ParentClass {
	
	String name= "Child String";
	
	public ChildClass() {
		
		super();
		System.out.println("Child constructor");
		
	}
	
public void getData() {
	
	
	System.out.println(super.name);
}

public void getString()
{
	System.out.println("Child class");
	super.getString();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cd=new ChildClass();
		cd.getData();
		cd.getString();
		
		
	}

}
