package lang;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "abcAbcabcABC";
		
		// chatAt
		char c = s.charAt(2);
		System.out.println(c);
		
		//indexOf
		System.out.println(s.indexOf("Abc"));
		System.out.println(s.indexOf("ab"));
		System.out.println(s.lastIndexOf("ab"));
		System.out.println(s.indexOf("XYZ"));
		
		//replace(치환)
		System.out.println(s.replace("bc", "12"));
		System.out.println(s.replaceAll("bc", "12"));
		System.out.println(s.replaceAll("[a-z]", "12"));
		
		//substring
		System.out.println(s.substring(3, 7));
		
		//case
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//concat
		String str1 = " ab cd ";
		String str2 = ",efg";
		
		str1 = str1.concat(str2);
		System.out.println(str1);
		
		//trim (앞, 뒤의 공백만 제거)
		System.out.println("---" + str1 + "---");
		System.out.println("---" + str1.trim() + "---");
		
		//split
		String[] tokens = str1.split(",");
		
		for (String token : tokens) {
			System.out.println(token);
		}
		
		//split 예외
		tokens = "abcdefg".split(",");
		
		for (String token : tokens) {
			System.out.println(token);
		}
		
		tokens = "".split(",");
		System.out.println(tokens.length);
		System.out.println("--" + tokens[0] + "--");
	}
}
