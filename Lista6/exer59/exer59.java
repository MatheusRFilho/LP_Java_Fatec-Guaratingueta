	import java.util.Scanner;
	class Exer59{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=0,c=0,quantidadeTermos=0;
			System.out.println("Digite a o primeiro termo");
			a=scanner.nextInt();
			System.out.println("Digite a o segundo termo");
			b=scanner.nextInt();
			System.out.println("Digite a quantidade de Termos que serão gerados");
			quantidadeTermos=scanner.nextInt();
			
			for(int contador=0;contador<quantidadeTermos ;contador++)
			{
				
				
				
				c=a+b;
				a=b;
				b=c;
				

				System.out.print(" "+c);
			}

		}
	}