import java.util.Scanner;
import java.util.Random;
class Exer22{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int quantidade,tamanho;

		do{
			System.out.println("Digite a quantidade de posições");
			quantidade=scanner.nextInt();
		}while(quantidade>20 || quantidade<=0);
		do{
			System.out.println("Digite o valor maximo");
			tamanho=scanner.nextInt();
		}while(tamanho<0);

		int ac[] = new int[quantidade];
		
		for	(int i=0;i<ac.length;i++){
			ac[i]=random.nextInt(tamanho);
			System.out.print(ac[i]+" ");
		}


	}
}