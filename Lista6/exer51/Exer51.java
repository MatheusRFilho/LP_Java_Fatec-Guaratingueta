	import java.util.Scanner;
	class Exer51{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=0,c=0,quantidadeTermos=0;
			System.out.println("Digite a quantidade de termos da sequencia");
			quantidadeTermos=scanner.nextInt();
			quantidadeTermos--;
			for(int contador=0;contador<=quantidadeTermos ;contador++)
			{
				
				if(contador==1)
				{
					a=1;
				}
				
				c=a+b;
				a=b;
				b=c;
				

				System.out.print(" "+c);
			}

		}
	}