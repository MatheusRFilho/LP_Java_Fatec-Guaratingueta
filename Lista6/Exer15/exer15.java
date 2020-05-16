
import java.util.Scanner;

class exer15{
	public static void main(String[] args) {
		int valor1,valor2,valortotal=0,media;
		Scanner scanner = new Scanner(System.in);
			valor1=scanner.nextInt();
			valor2=scanner.nextInt();
	

	if (valor1<valor2){
		for (int contador=valor1;contador<=valor2;contador++)
		{
		
		valortotal+=contador;
			
		
		}
			System.out.println(valortotal);
		}
	else{
		System.out.println("Impossivel realizar a conta");
	}
	}
}