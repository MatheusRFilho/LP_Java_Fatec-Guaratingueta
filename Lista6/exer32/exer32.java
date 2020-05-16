import java.util.Scanner;
class exer32{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo=0;
			do{
				System.out.println("Digite o Valor");
				codigo=scanner.nextInt();
			}while(codigo<0);
			if(codigo!=0)
			{
			for(int c=0;c<=codigo;c+=2)
			{
				System.out.println("= "+c);
			}
			}
	}
}