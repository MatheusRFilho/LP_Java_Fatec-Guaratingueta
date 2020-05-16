
import java.util.Scanner;

class exer7{
	public static void main(String[] args) {
		int valor=-20;
		Scanner scanner = new Scanner(System.in);


		
		while(valor<0 || valor>=10){
 				valor=scanner.nextInt();

		}

		for (int contador=1;contador<=10;contador++)
		{
			int resultado=valor*contador;
			System.out.println(resultado);
		}
		
	}
}