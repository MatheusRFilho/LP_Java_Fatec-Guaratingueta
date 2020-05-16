import java.util.Scanner;
class exer42{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int multiplicacao=1,n=1;	
		for(int c=1;c<=10;c++)
		{
			multiplicacao*=c;

			System.out.println((n++)+"! = "+multiplicacao);
		}
		


}
}