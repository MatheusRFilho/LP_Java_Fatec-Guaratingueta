import java.util.Scanner;
class Exer22{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String frase="",palavra="";
		int quantidade=0;
		System.out.println("Digite a frase");
		frase=scanner.nextLine();
		System.out.println("Digite a palavra");
		palavra=scanner.nextLine();

		for(int i=0;i<=frase.length()-palavra.length();i++)
		{
			if(frase.substring(i,i+3).equalsIgnoreCase(palavra))
			{
				quantidade++;
			}
		}
		System.out.println("Existem "+quantidade+" palavras nessa frase");

	}
}