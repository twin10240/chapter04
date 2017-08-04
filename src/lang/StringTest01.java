package lang;

public class StringTest01 {
	public static void main(String[] args) {
		// 문자 " escape
		String s = "I say \"hello\"";
		System.out.println(s);
		
		// 문자 ' escape
		char c = '\'';
		
		// 문자 \ escape
		String path = "d:\\bigdata";
		System.out.println(path);
		
		// \t, \n, \r, \b ...
		System.out.println("");
		System.out.print("\n");
		
		// + 연산이 가능하다
		String s1 = "Hello" + " World";
		String s2 = "Hello";
		s2 += " world";
		
		// 내부 문자(배)열 가져오기
		char[] cs = s2.toCharArray();
		System.out.println(cs);
	}
}
