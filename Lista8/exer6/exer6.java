import java.util.Random;
import java.util.Scanner;
class exer6{
	public static void main(String[] args) {

		int a[],b[] ;
		int numeroDePosicoes;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Digite o numero de posicoes");
			numeroDePosicoes=scanner.nextInt();
		}while(numeroDePosicoes>15 || numeroDePosicoes<0);

		a = new int[numeroDePosicoes];
		b = new int[numeroDePosicoes];
		

		for(int i=0;i<a.length;i++){
		a[i]=random.nextInt(50);
		b[i]=random.nextInt(50);

		if(a[i]==b[i])
		{
			System.out.println(i+" "+a[i]+" "+b[i]);
		}
		}
		



	}
}