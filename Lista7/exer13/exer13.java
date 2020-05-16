import java.util.Scanner;
class Exer13{
	public static void main(String[] args) {
		String frase;
	
		int quantidade=0,quantidaden=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		

		for(int letra=65;letra<=90;letra++)
		{
			if(letra!=65 && letra!=69 && letra!=73 && letra!=79 && letra!=85)
			{
				for(int i=0; i<frase.length() ;i++)
			{
			if(frase.toUpperCase().charAt(i)==(char)letra)
			{
				quantidade++;
			
			}	
			}
			}
			
			
		
	}
	System.out.println(quantidade+" Consoantes");
		

		
}
}