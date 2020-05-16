import java.util.Scanner;
class Exer11{
	public static void main(String[] args) {
		String frase;
	
		int quantidade=0,quantidaden=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		

		for(int letra=65;letra<=90;letra++)
		{
			
			for(int i=0; i<frase.length() ;i++)
			{
			if(frase.toUpperCase().charAt(i)==(char)letra)
			{
				quantidade++;
			
			}	
			
			
		}
	
	}
		System.out.println(quantidade+" Letras");

		for(int numero=48;numero<=57;numero++)
			{
				for(int i=0; i<frase.length() ;i++)
			{
			if(frase.toLowerCase().charAt(i)==(char)numero)
			{
				quantidaden++;
			
			}	
			
			
		}
			}
	System.out.println(quantidaden+" Numeros");
}
}