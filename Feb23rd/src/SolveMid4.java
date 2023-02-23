
public class SolveMid4 {
	static int mid(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return c;
			else
				return a;
		else if(a > c)
			return a;
		else if(b < c)
			return b;
		else
			return c;
	}
}
