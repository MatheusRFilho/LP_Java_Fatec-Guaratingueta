	import java.util.Scanner;
	class Exer55{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int valor=0,soma=0;
			System.out.println("Digite o termo");
			valor=scanner.nextInt();

			for(int c=1;c<valor;c++)
			{
				if (valor%c==0)
				{
					soma+=c;
				}
			}
			if(valor==soma)
			{
				System.out.println("O valor e perfeito");
			}
		

		}
	}