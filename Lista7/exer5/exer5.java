import java.util.Scanner;
class Exer5{
	public static void main(String[] args) {
		String frase="";
		int quantidade=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();

		for(int i=0; i<frase.length() ;i++)
		{
			if(frase.toLowerCase().charAt(i)=='a')
			{
				quantidade++;
			}
		}
		System.out.println("Existem "+quantidade+" a(s) em sua frase");
	}
}