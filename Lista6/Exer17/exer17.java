
import java.util.Scanner;
class exer17{
	public static void main(String[] args) {
		int valor1,valor2,valortotal=0,media;
		char opcao;
		
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		

		
		do{

			do{
				System.out.println("Digite a nota 1");
				valor1= scanner.nextInt();
				System.out.println("Digite a nota 2");
				valor2= scanner.nextInt();
			}while(valor1>10 || valor2>10);

			valortotal=(valor1+valor2)/2;
			System.out.println("A nota do aluno e "+valortotal);

			System.out.println("NOVO CaLCULO (S/N)?");
			opcao= sc.nextLine().charAt(0);
		}while(opcao =='s');
		
	System.out.println(valortotal);
	}
}