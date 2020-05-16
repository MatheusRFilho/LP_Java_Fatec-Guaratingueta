import java.util.Random;
import java.util.Scanner;
class exer3{
	public static void main(String[] args) {

		int c[] ;
		int numeroDePosicoes;
		
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Digite o numero de posicoes");
			numeroDePosicoes=scanner.nextInt();
		}while(numeroDePosicoes>20 || numeroDePosicoes<0);

		c = new int[numeroDePosicoes];

		for(int i=0;i<c.length;i++){
			c[i]=scanner.nextInt();
		}

		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		scanner.close();
	}
}