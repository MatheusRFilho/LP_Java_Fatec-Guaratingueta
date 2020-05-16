
import java.util.Scanner;
class exer6{
	public static void main(String[] args) {
		int valor1,valor2;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Valor 1");
		valor1=scanner.nextInt();
		System.out.println("Digite o valor 2");
		valor2=scanner.nextInt();

		if(valor1>valor2){
			System.out.println("O maior valor e o valor 1 ("+valor1+")");
		}
		else if(valor2>valor1){
			System.out.println("O maior valor e o valor 2 ("+valor2+")");
		}
		else{
			System.out.println("Valores iguais");
		}
	}
}

//Matheus Rodrigo Queiroz de Lima Filho