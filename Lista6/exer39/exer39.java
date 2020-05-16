import java.util.Scanner;
class exer39{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0,n=1;
		double soma=0;
			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);
			if(codigo!=0)
			{

			
			do
			{
				soma+=(double)n/codigo;
				System.out.println("= "+n+"/"+codigo);
				codigo--;
				n++;
				
			}while(codigo!=0);
			
			}
			System.out.println("A soma total das fracoes e de "+soma);
}
}