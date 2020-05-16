import java.util.Random;
class exer11{
	public static void main(String[] args) {

		int qa[],qb[],qc[] ;
		int aux=0;
	
		Random random = new Random();

		qa = new int[5];
		qb = new int[5];
		qc = new int[10];


			for(int i=0;i<qa.length;i++)
				{
					qa[i]=random.nextInt(50);
					qb[i]=random.nextInt(50);
				}	
			for(int k=0;k<qc.length;k++)
				{

					if(k%2==1)
					{
					qc[k]=qb[aux];
					aux++;	
					}	
					else{
					qc[k]=qa[aux];
					}
				}
		
			System.out.print("Vetor QA");
			for(int k=0;k<qa.length;k++)
			{
				System.out.print(" "+qa[k]);	
				
			}
			System.out.print("\nVetor QB");
			for(int l=0;l<qb.length;l++)
			{
				System.out.print(" "+qb[l]);	
				
			}
			System.out.print("\nVetor QC");
			for(int m=0;m<qc.length;m++)
			{
				System.out.print(" "+qc[m]);	
				
			}
		}
	}

			