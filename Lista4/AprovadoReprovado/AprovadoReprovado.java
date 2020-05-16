import java.util.Scanner;

class AprovadoReprovado{
	
	public static void main(String[] args) {
		int valor;
		Scanner scanner = new Scanner(System.in);

		valor=scanner.nextInt();

		
		if(valor>10 || valor<0)
		{
			System.out.println("Valor Invalido");
		}
		else
		{
			if (valor<6)
			{
				System.out.println("reprovado");
			}
			else
			{
				System.out.println("Aprovado");
			}
		}
	}
}