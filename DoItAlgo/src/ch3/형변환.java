package ch3;

public class 형변환 {
	public static void main(String[] args) {
		
		// 1. String 형 -> 숫자형
		String str = "1234";
		
		// string에서 int로 바꾸기
		int a = Integer.parseInt(str);
		int b = Integer.valueOf(str);
		
		// string에서 double로
		double c = Double.valueOf(str);
		
		// string에서 float로
		float d = Float.valueOf(str);
		
		// string에서 long으로
		long e = Long.parseLong(str);
		
		// string에서 short로
		short f = Short.parseShort(str);
		
		
		// 2. 숫자형 -> String형
		int g = 1234;
		
		// int에서 string으로
		String h = String.valueOf(g);
		String i = Integer.toString(g);
		
		float j = (float) 1.234;
		double k = 1.234;
		
		// float에서 String으로
		String l = String.valueOf(j);
		String m = Float.toString(j);
		
		// double에서 String으로
		String n = String.valueOf(k);
		String o = Double.toString(k);
		
		
		
		
		
	}
}
