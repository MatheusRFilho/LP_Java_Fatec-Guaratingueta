import java.util.Scanner;
class exer36{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0;
			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);
			if(codigo!=0)
			{
			System.out.println("= 1");
			for(int c=2;c<=codigo;c++)
			{
				int n=1;
				System.out.println("= 1/"+c);
				
			}
	}
}
}