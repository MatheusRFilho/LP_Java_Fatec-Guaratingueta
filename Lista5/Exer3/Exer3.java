
import java.util.Scanner;
class exer3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeroDeMaca;
		double valorTotal;
		numeroDeMaca=scanner.nextInt();

		if(numeroDeMaca<12)
		{
			valorTotal=numeroDeMaca*1.30;
		}
		else
		{
			valorTotal=numeroDeMaca*1;
		}
		System.out.println("Apos comprar "+numeroDeMaca+" custara "+valorTotal);
	}
}

//Matheus Rodrigo Queiroz de Lima Filho