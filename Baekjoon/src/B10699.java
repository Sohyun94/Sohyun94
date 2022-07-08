import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B10699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date d = new Date();
		String td = sdf.format(d);
		
		System.out.println(td);
	}

}
