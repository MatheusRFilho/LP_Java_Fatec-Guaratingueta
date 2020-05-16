import java.util.Scanner;
class Exer61{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidade=0,c=2,o=1;
		double total=0;

		System.out.println("Digite a quantidade de valores");
		quantidade=scanner.nextInt();

		for(int i=1;i<=quantidade;i++)
		{
			total+=(double)c/o;
			System.out.print(c+"/"+o+",");
			c+=2;
			o+=2;
		}	

		System.out.println("\nTotal ="+total);
	}
}