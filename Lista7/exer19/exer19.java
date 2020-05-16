import java.util.Scanner;
class Exer19{
	public static void main(String[] args) {
		String frase="",frase2="";
		int quantidade=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		
		frase = frase.trim();


		for(int i=0; i<frase.length() ;i++)
		{
			if(frase.toLowerCase().charAt(i)!=(char)32)
			{
				frase2+=frase.toLowerCase().charAt(i);
			}
			
		}	


		int j=frase2.length()-1;
		for(int i=0; i<frase2.length() ;i++)
		{
			if(frase2.charAt(i)==frase2.charAt(j))
			{
				quantidade++;
			}
			j--;
		
			
		}
		if(quantidade==frase2.length())
		{
			System.out.println("e um palindromo");
		}
		else{
			System.out.println("nao e palindromo");
		}
		




		

	}
}