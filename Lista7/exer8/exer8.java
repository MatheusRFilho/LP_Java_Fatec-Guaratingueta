import java.util.Scanner;
class Exer8{
	public static void main(String[] args) {
		String frase;
	
		int quantidade=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		

		for(int letra=97;letra<=122;letra++)
		{
			quantidade=0;
			for(int i=0; i<frase.length() ;i++)
			{
			if(frase.toLowerCase().charAt(i)==letra)
			{
				quantidade++;
			
			}	
			
			}
			if(quantidade!=0)
			{
			System.out.println("Letra "+(char)letra+ " quantidade"+quantidade);	
			}
			
		}
	
	}
}