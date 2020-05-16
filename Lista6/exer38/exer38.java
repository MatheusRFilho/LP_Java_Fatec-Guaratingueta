import java.util.Scanner;
class exer38{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0,n=0;
			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);
			if(codigo!=0)
			{

			System.out.println("= "+n);
			for(int c=1;c<=codigo;c++)
			{
				
				System.out.println("= "+n+"/"+c);
				n++;
			}
	}
}
}