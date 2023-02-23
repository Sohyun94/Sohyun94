
public class SolveMid3 {
	static int mid(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(c > a)
			return c;
		else
			return b;
	}

}
