package corejava;

public class ThisDemo {
	
	int r=8;
	
	public ThisDemo()
	{
		System.out.println("Constructor");
	}
	
	public ThisDemo(int r)
	
	{
		this();
		System.out.println(this.r);
	}
	
	public void summ() {
	int r =9;
	System.out.println(r);
	
	}
		
	public void add()
	{
		summ(); //this is by default same as this.summ(); implicit
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo td= new ThisDemo(); //executes the default constructor
ThisDemo s= new ThisDemo(10);//executes the parameterized  constructor block
td.add();//executes the add() method block
		
		
	}

}
