import java.util.Scanner;
class Exer24{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		String sequencia="";
		int quantidade=0,maior=0;

		System.out.println("Digite a sequencia");
		sequencia=scanner.nextLine();
		
		for(int i=0;i<sequencia.length();i++)
		{
			if(sequencia.charAt(i)==(c))
			{
				quantidade++;
			}
			else
			{
				quantidade=0;
			}

			if(quantidade>maior)
			{
				maior=quantidade;
			}
		}
		System.out.println(maior+"E a maior sequencia de 1");


		}
}