import java.util.Scanner;

class Saudacao{
	public static void main(String[] args) {
		int opcao;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha uma Opção(1-2-3) \n1-Gerar Hora aleatoriamente \n2-Dizer a hora \n3-Sair");
		opcao=scanner.nextInt();

		if(opcao==1)
		{
			int hora = (int)(Math.random () * 24);
			System.out.println(hora);

			if(hora>=0 && hora<=6)
			{
				System.out.println("Zzzzz");
			}
			else if(hora>6 && hora<=11)
			{
				System.out.println("Bom dia");
			}
			else if(hora>11 && hora<=17)
			{
				System.out.println("Bom tarde");
			}
			else if(hora>17 && hora<=23)
			{
				System.out.println("Bom noite");
			}
		}
		else if(opcao==2)
		{
			System.out.println("Digite a hora :");
			int hora=scanner.nextInt();

			if(hora>=0 && hora<=6)
			{
				System.out.println("Zzzzz");
			}
			else if(hora>6 && hora<=11)
			{
				System.out.println("Bom dia");
			}
			else if(hora>11 && hora<=17)
			{
				System.out.println("Bom tarde");
			}
			else if(hora>17 && hora<=23)
			{
				System.out.println("Bom noite");
			}
		}
		else if(opcao==3)
		{

		}
		else
		{
			System.out.println("Opcao Invalida");
		}
	}
}