package corejava;

public class Exceptiondemo {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub

		int i =9;
		int h= 0;
		int k;
		/*
		 * try { k= i/h; System.out.println(k); }
		 */
		
		try
		{
			int a[]=new int[6];
			System.out.println(a[8]);
		}
		

		  catch(ArithmeticException e) 
		{ 
			  System.out.println("ArithmeticException");
		}
		  catch(Exception e) { 
			  System.out.println("Error");
			  }

		finally
		{
			System.out.println("delete");
		}
		
	}

}
