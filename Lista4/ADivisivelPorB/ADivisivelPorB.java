import java.util.Scanner;

class ADivisivelPorB{
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);

		a=scanner.nextInt();
		b=scanner.nextInt();


		if(a>1000 || a<0)
		{
			System.out.println("Valor Invalido");
		}
		if(b>21 || b<=0)
		{
			System.out.println("Valor Invalido");
		}
		else
		{
			if(a>b){
				System.out.println("A>b");
			}
			else if(a<b){
				System.out.println("A<B");
			}
			else
			{
				System.out.println("A=B");
			}


			if(a%b==0)
		{
			System.out.println("é divisivel");
		}
		else
		{
			System.out.println("Nao e divisivel");
		}
		}
		
	}
}