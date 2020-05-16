import java.util.Scanner;
class exer45{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int multiplicacao=1,j=0;

		System.out.println("Digite a quantidade de valores");
		j=scanner.nextInt();
		
		for (int n=j ;n!=1;n--)
		{
				for(int contador=n;contador!=1;contador--)
				{
				multiplicacao*=contador;
				}
				System.out.println(n+"! = "+multiplicacao);
				multiplicacao=1;
		}

}
}