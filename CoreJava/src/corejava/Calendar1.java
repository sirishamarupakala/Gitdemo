package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy H:mm:ss");
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		
	}

}
