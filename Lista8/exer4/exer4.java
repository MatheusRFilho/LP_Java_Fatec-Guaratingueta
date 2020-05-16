import java.util.Random;
import java.util.Scanner;
class exer4{
	public static void main(String[] args) {

		int d[] ;
		int numeroDePosicoes;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Digite o numero de posicoes");
			numeroDePosicoes=scanner.nextInt();
		}while(numeroDePosicoes>20 || numeroDePosicoes<0);

		d = new int[numeroDePosicoes];

		for(int i=0;i<d.length;i++){
			d[i]=scanner.nextInt();
		}

		for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		}

	}
}