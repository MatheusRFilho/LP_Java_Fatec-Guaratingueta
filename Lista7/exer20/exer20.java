import java.util.Scanner;
class Exer20{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String frase="";

		System.out.println("Digite a frase");
		frase=scanner.nextLine();

		System.out.println("A quantidade de palavras e de "+frase.split(" ").length);
	}
}