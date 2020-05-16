import java.util.Scanner;
class Exer64{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidade=0,c=2,comparador3=2,o=1,cf=0,af=0,bf=1,ap=0,comparador=0,comparador2=2,p=2;
		double total=0;

		System.out.println("Digite a quantidade de valores");
		quantidade=scanner.nextInt();

		for(int i=1;i<=quantidade;i++)
		{
			if(comparador3==2)
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
				comparador3--;
			}
			else if(comparador3==1)
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
			



			total-=(double)cf/ap;
			System.out.print(cf+"/"+ap+",");
				comparador3++;
			}
		}	

		System.out.println("\nTotal ="+total);
	}
}