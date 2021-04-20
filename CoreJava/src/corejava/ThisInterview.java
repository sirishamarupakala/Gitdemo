package corejava;

public class ThisInterview {
int o=9;
public void sum() {
	int o=8;
	int p= o+this.o;  //how to add the instance variable and local variable
	System.out.println(p);
	
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisInterview t =new ThisInterview();
		t.sum();
	}

}
