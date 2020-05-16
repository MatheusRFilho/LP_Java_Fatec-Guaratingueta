import java.util.Scanner;
class Exer17{
	public static void main(String[] args) {
		String frase1="",frase2="";
		int j=0,quantidade=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase1=scanner.nextLine();
		System.out.println("Digite outra frase");
		frase2=scanner.nextLine();

		if(frase1.length()==frase2.length())
		{
		for(int i=0; i<frase1.length() ;i++)
		{
			if(frase1.charAt(i)==frase2.charAt(i))
			{
				quantidade++;
			}
			
		}
		
		if(quantidade==frase1.length())
		{
			System.out.println("Frases Iguais");
		}
		else{
			System.out.println("Frases Diferentes");
		}
		}
		else
		{
			System.out.println("Frases Diferentes");
		}




		

	}
}