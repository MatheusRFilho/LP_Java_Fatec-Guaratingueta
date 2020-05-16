import java.util.Scanner;
class Exer65{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int quantidade=0,c=2,comparador3=1,o=1,cf=0,af=0,bf=1,ap=0,comparador=0,comparador2=2,p=2,n=0,f=0;
		double total=0;

		System.out.println("Digite a quantidade de valores");
		quantidade=scanner.nextInt();

		for(int i=0;i<quantidade;i++)
		{
			if(comparador3==2)
			{
				f=1;
				for(cf=1;cf<=i;cf++)
				{
					f*=cf;
				}
				o=f;


	
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
			



			total+=(double)o/ap;
			System.out.print(o+"/"+ap+",");
				comparador3--;
			}
			else if(comparador3==1)
			{
				f=1;
				for(cf=1;cf<=i;cf++)
				{
					f*=cf;
				}
				o=f;


	
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
			



			total-=(double)o/ap;
			System.out.print(o+"/"+ap+",");
				comparador3++;
			}
		}	

		System.out.println("\nTotal ="+total);
	}
}