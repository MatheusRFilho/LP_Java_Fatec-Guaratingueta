import java.util.Scanner;
class exer5{
	public static void main(String[] args) {
int valor=0;
			Scanner scanner = new Scanner(System.in);
			
		do{
		 valor=scanner.nextInt();
		}while(valor<0);

		for (int contador=1;contador<=valor;contador++)
		{
			System.out.println(contador);
		}
	}
}