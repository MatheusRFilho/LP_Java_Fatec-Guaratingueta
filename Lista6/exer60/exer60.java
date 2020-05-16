	import java.util.Scanner;
	class Exer60{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=0,c=0,i=1,valorDigitado=0;
			System.out.println("Digite a o primeiro termo");
			a=scanner.nextInt();
			System.out.println("Digite a o segundo termo");
			b=scanner.nextInt();
			System.out.println("Digite um valor");
			valorDigitado=scanner.nextInt();
			
			for(int contador=0;c<valorDigitado ;contador++)
			{
				c=a+b;
				a=b;
				b=c;				
			}
			if(valorDigitado==c)
				{
					System.out.println("Ele pertence a sequencia");
				}
			}
	}