
import java.util.Scanner;
class exer18{
	public static void main(String[] args) {
		double valor=0,estoqueTotal=0,valorMedio=0;
		int contador=0;
		char opcao;
		
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		

		
		do{
			System.out.println("Digite o Valor do produto");
			valor+=scanner.nextInt();
			System.out.println("Digite o valor no estoque do produto");
			estoqueTotal+=scanner.nextInt();
			contador++;
			System.out.println("NOVO CaLCULO (S/N)?");
			opcao= sc.nextLine().charAt(0);
		}while(opcao =='s');
		valorMedio = valor/contador;

		
	System.out.println("o VALOR MEDIO DOS PRODUTOS NO ESTOQUE E "+valorMedio);
	System.out.println("o VALOR TOTAL NO ESTOQUE DOS PRODUTOS E "+estoqueTotal);

	}
}