import java.util.Scanner;
class exer11{
	public static void main(String[] args) {
	int valor1,valor2,resultado=0;
	String operacao;
	
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor 1");
		valor1=scanner.nextInt();
		System.out.println("Digite o Valor 2");
		valor2=scanner.nextInt();
		System.out.println("Digite a operação aritmetica");
		operacao= sc.nextLine ();

		/*operacao= sc.nextLine ().charAt(0);
		if(operacao=='+')
		{
			resultado = valor1 + valor2;
		}
		else if(operacao=='-')
		{
			resultado = valor1 - valor2;
		}
		else if(operacao=='/')
		{
			resultado = valor1 / valor2;
		}
		else if(operacao=='*')
		{
			resultado = valor1 * valor2;
		}
		*/

		if(operacao.equals("+"))
		{
			resultado = valor1 + valor2;
		}
		else if(operacao.equals("-"))
		{
			resultado = valor1 - valor2;
		}
		else if(operacao.equals("/"))
		{
			resultado = valor1 / valor2;
		}
		else if(operacao.equals("*"))
		{
			resultado = valor1 * valor2;
		}

		
		
		System.out.println("resultado = "+resultado);
	}
}

//Matheus Rodrigo Queiroz de Lima Filho