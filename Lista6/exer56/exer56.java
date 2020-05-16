	import java.util.Scanner;
	class exer56{
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int soma=0;
			
			for(int j=1;j<=900;j++)
			{
			for(int c=1;c<j;c++)
			{

				if (j%c==0)
				{
					soma+=c;
				}
			}

			if(j==soma)
			{
				System.out.println(j+" O valor e perfeito");
			}
			soma=0;
			}
		

		}
	}