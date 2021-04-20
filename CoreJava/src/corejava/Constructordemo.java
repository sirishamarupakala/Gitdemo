package corejava;

public class Constructordemo {

	
	public Constructordemo()
	{
		System.out.println("Constructor block");
	}
		
	public Constructordemo(int a)
	{
		System.out.println(a);
		 a =8;
		 System.out.println(a);
	}
	
	public Constructordemo(int a,int b)
	{
		 System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo c =new Constructordemo();
		Constructordemo c1 =new Constructordemo(6);
		Constructordemo c2 =new Constructordemo(6,9);
	}

}
