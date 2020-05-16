	import java.util.Scanner;
	class Exer54{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=0,c=0,valorInicial=0,valorFinal=0,comparador=2;
			System.out.println("Digite o termo inicial");
			valorInicial=scanner.nextInt();
			System.out.println("Digite o termo final");
			valorFinal=scanner.nextInt();
			for(int contador=0;contador<=valorFinal ;contador++)
			{
				if(contador>=valorInicial && contador<=valorFinal)
				{
				System.out.print(" "+a);
				}
				if(contador==0)
				{
					a=1;
				}
				c=a+b;
				a=b;
				b=c;
					
				
							
			}

		}
	}