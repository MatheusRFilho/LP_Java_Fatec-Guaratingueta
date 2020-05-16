import java.util.Scanner;
class Exer21{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String frase="";
	
		System.out.println("Digite a frase");
		frase=scanner.nextLine();

		for(int i=0;i<frase.length();i++)
		{
			if(frase.charAt(i)==(char)32)
			{
				System.out.println("");
			}
			else
			{
				System.out.print(frase.charAt(i));
			}
		}
			
	}
}