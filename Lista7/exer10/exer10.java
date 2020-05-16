import java.util.Scanner;
class Exer10{
	public static void main(String[] args) {
		String frase;
	
		int quantidade=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		

		for(int letra=65;letra<=90;letra++)
		{
			
			for(int i=0; i<frase.length() ;i++)
			{
			if(frase.charAt(i)==(char)letra)
			{
				quantidade++;
			
			}	
			
			}
			
		}
	System.out.println(quantidade);	
	}
}