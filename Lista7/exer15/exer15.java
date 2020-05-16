import java.util.Scanner;
class Exer15{
	public static void main(String[] args) {
		String frase;
	
		int quantidade=0,quantidaden=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		

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
			if(quantidaden!=0)
			{
	System.out.println("Existem Numeros");
			}
			else 
			{
				System.out.println("Nao existem numeros");
			}
}
}