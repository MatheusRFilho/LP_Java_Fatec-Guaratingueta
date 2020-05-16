
import java.util.Scanner;
class exer20{
	public static void main(String[] args) {
		int maior=0,menor=0,valor=0; 
			Scanner scanner = new Scanner(System.in);	
		for(int contador=1;contador<=100;contador++)
		{
				valor=scanner.nextInt();
				if(valor>maior)
				{
					maior=valor;
				}
				if(valor<menor)
				{
					menor=valor;
				}
		}
		System.out.println("O maior numero e "+maior);
		System.out.println("O menor numero e "+menor);
}
}