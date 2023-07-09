
public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		boolean valido = true;
		int idade = 18;

		if (idade >= 18 && valido) {
			valido = true;
			System.out.println("Você pode entrar");
		} else {
			valido = false;
			System.out.println("Você não pode entrar");
		}
	}
}
