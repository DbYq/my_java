package MyIntegerTest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateTest
{

	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		Date d1 = (Date) df.parse("1971-3-10 10:40:52");
		System.out.println(d1.getTime());
		
		Date d2=new Date(1000L*3600*23);
		String str=df.format(d2);
		System.out.println(str);
	}

}
