import java.util.Scanner;
class Exer63{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidade=0,cf=0,o=1,af=0,bf=1,ap=0,comparador=0,comparador2=2,p=2;
		double total=0;

		System.out.println("Digite a quantidade de valores");
		quantidade=scanner.nextInt();

		for(int i=0;i<quantidade;i++)
		{
			
			if(i==1)
				{
					cf=1;
					
				}
			else
				{
					cf=af+bf;
					af=bf;
					bf=cf;
				}


	
		do{
			comparador=0;
			
		 for (int contador=1;contador<=p;contador++)
		 {
		 	if(p%contador==0)
		 	{

		 		comparador++;
		 	}
		 }
		 if(comparador==2)
		 {
		 	ap=p;	
		 }
		 else{
		 	comparador2++;
		 }
		 p++;	
		 	
		}while(comparador!=2);
			



			total+=(double)cf/ap;
			System.out.print(cf+"/"+ap+",");
			
		}	

		System.out.println("\nTotal ="+total);
	}
}