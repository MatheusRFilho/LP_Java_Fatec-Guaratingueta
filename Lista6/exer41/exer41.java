import java.util.Scanner;
class exer41{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor=0,multiplicacao=1;
		System.out.println("Digite o valor de N");
		valor=scanner.nextInt();
		for(int c=valor;c>=1;c--)
		{
			multiplicacao*=c;
		}
		System.out.println("!N = "+multiplicacao);


}
}