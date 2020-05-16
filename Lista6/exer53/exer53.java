	import java.util.Scanner;
	class Exer53{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a=0 ,b=1,c=0,quantidadeTermos=0;
			
			for(int contador=0;c<255 ;contador++)
			{
				c=a+b;
				a=b;
				b=c;
					
				if(c<255)
				{
				System.out.print(" "+c);
				}			
			}

		}
	}