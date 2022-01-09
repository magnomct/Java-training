package javaa;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JavaScript; jQuery; JAVA";
		//expresão quebra os tokens a partir do ponto e virgula
		
		s.split(";");
		String[] tokens = s.split(";");
		System.out.println(tokens.length + " tokens");
		for (String token : tokens) {
			System.out.println(token);
		}
		

	}

}
