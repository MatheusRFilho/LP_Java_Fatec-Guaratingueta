import java.util.Random;
import java.util.Scanner;
class exer7{
	public static void main(String[] args) {

		int e[] ;
		int numeroDePosicoes,maior=0,menor=51;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Digite o numero de posicoes");
			numeroDePosicoes=scanner.nextInt();
		}while(numeroDePosicoes>20 || numeroDePosicoes<0);

		e = new int[numeroDePosicoes];

		

		for(int i=0;i<e.length;i++){
		e[i]=random.nextInt(50);
		
		if(e[i]>maior)
		{
			maior = e[i];
		}
		if(menor>e[i])
		{
			menor = e[i];
		}	
		System.out.println(e[i]);
		}
		
		System.out.println("----------------------------------");
		System.out.println("O maior valor do vetor e "+maior);
		System.out.println("O menor valor do vetor e "+menor);



	}
}