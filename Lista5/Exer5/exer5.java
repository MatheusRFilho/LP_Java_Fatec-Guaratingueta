
import java.util.Scanner;
class Exer5 {
	public static void main(String[] args) {
		int anoAtual,anoNascimento,idade;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ano atual");
		anoAtual=scanner.nextInt();
		System.out.println("Digite o ano de nascimento");
		anoNascimento=scanner.nextInt();

		idade=anoAtual - anoNascimento;
		System.out.println("Sua idade e de " +idade+ " anos");
	}
}

//Matheus Rodrigo Queiroz de Lima Filho