	import java.util.Scanner;
	class Exer52{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=0,c=0,valor;
			System.out.println("Digite o termo");
			valor=scanner.nextInt();
			
			for(int contador=0;c<valor ;contador++)
			{
				
				if(contador==1)
				{
					a=1;
				}
				
				c=a+b;
				a=b;
				b=c;
			}

				if(c==valor)
				{
					System.out.println("Valor Pertence a fibbonacci");
					
				}
				else{
					System.out.println("Valor Nao pertence a fibbonacci");

				}
				
					
				

			

		}
	}