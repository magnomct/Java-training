package erros;

public class SenhaTeste {

	static void autenticar(String senha) 
		throws SenhaInvalidaException
	{
		if("123".equals(senha)){
		//autenticacao
		System.out.println("Autenticado");
		} else {
		//senha é incorreta
			throw new SenhaInvalidaException("Senha Incorreta");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			autenticar("1234");
		} catch(SenhaInvalidaException e) {
			e.printStackTrace();			
			System.out.println(e.getMessage());
			
			
		}

	}

}
