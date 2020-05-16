import java.util.Scanner;
class exer4{
	public static void main(String[] args) {
		int n1,n2;
		double media;
		Scanner scanner = new Scanner(System.in);

		n1=scanner.nextInt();
		n2=scanner.nextInt();

		media=(n1+n2)/2;
		
	
		
			if (media<6)
			{
				System.out.println("reprovado");
			}
			else
			{
				System.out.println("Aprovado");
			}
		
	}
}

//Matheus Rodrigo Queiroz de Lima Filho