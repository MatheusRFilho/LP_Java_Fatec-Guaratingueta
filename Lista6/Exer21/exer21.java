
import java.util.Scanner;
class exer21{
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		int maior=0,valor=0,i; 
		double valortotal=0;

		System.out.println("Digite a quantidade de numeros a serem lidos");
		i=scanner.nextInt();
			
		for(int contador=1;contador<=i;contador++)
		{
				valor=scanner.nextInt();
				if(valor>maior)
				{
					maior=valor;
				}
				valortotal+=valor;
		}
		valortotal=valortotal/i;
		System.out.println("O maior numero e "+maior);
		System.out.println("A media  e "+valortotal);
}
}