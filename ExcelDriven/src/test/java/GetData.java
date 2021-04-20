import java.io.IOException;
import java.util.ArrayList;

public class GetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Datadriven d=new Datadriven();
		ArrayList<String> s=d.getdata("TC name");
		System.out.println(s.get(0)); //will give the first cell 
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println(s.get(3));
	}

}
