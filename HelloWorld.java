import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
	
	public static void main(String a []) {
		System.out.println("Hello World");
		
		Calendar calendar = Calendar.getInstance();
		//calendar.clone()
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		try {
			Date d = new SimpleDateFormat("YYYY-mm-dd").parse("2018-10-04");
			System.out.println(d );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
