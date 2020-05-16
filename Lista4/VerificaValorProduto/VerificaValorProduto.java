import java.util.Scanner;

class VerificaValorProduto{
	
	public static void main(String[] args) {
		int precoProduto1,precoProduto2;
		Scanner scanner = new Scanner(System.in);

		precoProduto1=scanner.nextInt();
		precoProduto2=scanner.nextInt();
		
		if(precoProduto1>1001 || precoProduto1<1)
		{
			System.out.println("Valor Invalido");
		}
		if(precoProduto2>1001 || precoProduto2<1)
		{
			System.out.println("Valor Invalido");
		}
		else
		{
			if (precoProduto1 > precoProduto2)
				{
					System.out.println("O produto 2 e mais barato\n"+precoProduto1+","+precoProduto2);
				}
			else
				{
					System.out.println("O produto 1 e mais barato\n"+precoProduto1+","+precoProduto2);
				}
		}
	}
}