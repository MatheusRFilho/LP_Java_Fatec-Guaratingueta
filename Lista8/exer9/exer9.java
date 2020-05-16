import java.util.Scanner;
class exer9{
	public static void main(String[] args) {

		int g[],h[] ;
		int aux=0,j=0;
		Scanner scanner = new Scanner(System.in);

		g = new int[5];

		for(int i=0;i<g.length;i++){
		System.out.println("Digite a posicao "+i+" do vetor");
		g[i]=scanner.nextInt();
		
			if(g[i]%2==0)
			{
			aux++;
			}
		}
		if(aux>0)
		{
		h = new int[aux];

		do{
			for(int i=0;i<g.length;i++){
				if(g[i]%2==0)
				{
					h[j]=g[i];
					j++;
				}		
			}
		}while(j!=aux);

		for(int i=0;i<h.length;i++){
		System.out.print(h[i]+" ");
		
		}
		}
		else
		{
			System.out.println("O vetor nao contem numeros pares");
		}

	}
}	