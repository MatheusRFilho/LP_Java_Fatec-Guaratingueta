import java.util.Scanner;
class Exer18{
	public static void main(String[] args) {
		String frase="";
		int j=0,quantidade=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		

		if(frase.length()==8)
		{
		for(int i=0; i<frase.length() ;i++)
		{
		if(frase.charAt(i)=='1' || frase.charAt(i)=='0')
		{
			quantidade++;
		}	
		}
		if(quantidade==frase.length())
		{
			System.out.println("Sequencia de 8bit");
		}
		else{
			System.out.println("Nao e uma sequencia de 8 bit");
		}
		}
		else{
			System.out.println("Nao e uma sequencia de 8 bit");
		}
		
		



		

	}
}