import java.util.Scanner;
class Exer14{
	public static void main(String[] args) {
		String frase="",letra,caracter;
		int quantidade=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		System.out.println("Digite uma letra");
		letra=scanner.nextLine();
		System.out.println("Digite um caracter");
		caracter=scanner.nextLine();

		for(int i=0; i<frase.length() ;i++)
		{
			if(frase.toLowerCase().charAt(i)==letra.toLowerCase().charAt(0))
			{
				frase=frase.replace(letra.charAt(0),caracter.charAt(0));
			}
		}
		System.out.println(frase);
	}
}