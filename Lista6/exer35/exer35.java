import java.util.Scanner;
class exer35{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0;
			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);
			if(codigo!=0)
			{
			
			for(int c=1;c<=codigo;c++)
			{
				int n=c*-1;
				System.out.println("= "+c+"\n= "+n);
				
			}
	}
}
}