import java.util.Scanner;
class test{
	public static void main(String[] args) {
		String frase;
		String letra;
		int quantidade=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		frase=scanner.nextLine();
		System.out.println("Digite a letra testada");
		letra=scanner.nextLine();

		

		for(int i=0; i<frase.length() ;i++)
		{
			if(frase.toLowerCase().charAt(i)==letra.toLowerCase().charAt(0))
			{
				quantidade++;
			
			}
		}
		System.out.println("Existem "+quantidade+ " letras ("+letra+") 	em sua frase");
	}
}