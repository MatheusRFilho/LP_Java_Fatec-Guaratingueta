
import java.util.Scanner;

class exer9{
	public static void main(String[] args) {
		int valor=0,resultado=0;
		Scanner scanner = new Scanner(System.in);

	
		for (int contador=1;contador<=10;contador++)
		{
		valor=scanner.nextInt();
		if (valor<=20 && valor>=10){
			resultado++;
		}

		
		}
			System.out.println(resultado);
	}
}