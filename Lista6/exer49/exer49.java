import java.util.Scanner;
class exer49{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int comparador=0,valor=0,comparador2=1;


		System.out.println("Digite a quantidade de termos");
		valor=scanner.nextInt();



		for(int x=100;x>=1;x--)
		{
			comparador=0;
		 for (int contador=1;contador<=x;contador++)
		 {
		 	if(x%contador==0)
		 	{

		 		comparador++;
		 	}
		 }
		 if(comparador2<=valor)
		 {
		 	if(comparador==2)
		 	{
		 		System.out.println(x);
		 		comparador2++;
		 	}
		 	
		 }	
		}
}
}