import java.util.Scanner;
class exer44{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int multiplicacao=1,n=1,j=0;

		System.out.println("Digite a quantidade de valores");
		j=scanner.nextInt();
		for(int c=1;c<=j;c++)
		{
			multiplicacao*=c;

			System.out.println((n++)+"! = "+multiplicacao);
		}
		


}
}