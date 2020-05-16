
import java.util.Scanner;

class exer8{
	public static void main(String[] args) {
		int valor=0,resultado=0;
		Scanner scanner = new Scanner(System.in);

	
		for (int contador=1;contador<=10;contador++)
		{
		valor=scanner.nextInt();
		if (valor<0){
			resultado++;
		}

		
		}
			System.out.println(resultado);
	}
}