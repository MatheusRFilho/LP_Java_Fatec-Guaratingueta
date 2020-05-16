	import java.util.Scanner;
	class exer57{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int soma=0,c=0,n=0;
			n=scanner.nextInt();
			
			for(int i=1;c<n;i++)
			{
				soma=0;
			for(int j=1;j<i;j++)
			{

				if (i%j==0)
				{
					soma+=j;
				}
			}

			if(i==soma)
			{
				System.out.println(i+" O valor e perfeito");
				c++;
			}
			
			}
		

		}
	}