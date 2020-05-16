
import java.util.Scanner;

class exer10{
	public static void main(String[] args) {
		int valor=0,valortotal=0,media;
		Scanner scanner = new Scanner(System.in);

	
		for (int contador=1;contador<=10;contador++)
		{
		valor=scanner.nextInt();
		valortotal+=valor;

		
		}
		media=valortotal/10;
			System.out.println(media);
	}
}