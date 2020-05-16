import java.util.Scanner;
class exer8{
	public static void main(String[] args) {

		int f[] ;
		int soma=0;
		Scanner scanner = new Scanner(System.in);

		f = new int[5];

		for(int i=0;i<f.length;i++){
		System.out.println("Digite a posicao "+i+" do vetor");
		f[i]=scanner.nextInt();
		
			if(f[i]%2==1)
			{
			soma+=f[i];
			}
		}
		if(soma==0)
		{
			System.out.println("----------------------------------");
			System.out.println("O vetor nao contem numeros impares");	
		}
		else
		{
		System.out.println("----------------------------------");
		System.out.println("A soma dos valores impares do vetor e "+soma);
		}



	}
}	