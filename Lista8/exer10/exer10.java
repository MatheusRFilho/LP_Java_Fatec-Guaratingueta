import java.util.Random;
class exer10{
	public static void main(String[] args) {

		int pa[],pb[],pc[] ;
		
	
		Random random = new Random();

		pa = new int[5];
		pb = new int[5];
		pc = new int[10];


		for(int i=0;i<pa.length;i++)
		{
			pa[i]=random.nextInt(50);
			pb[i]=random.nextInt(50);

			pc[i]=pa[i];
			pc[i+pa.length]=pb[i];


		}	
		for(int j=0;j<1;j++)
		{
			System.out.print("Vetor PA");
			for(int k=0;k<pa.length;k++)
			{
				System.out.print(" "+pa[k]);	
				
			}
			System.out.print("\nVetor PB");
			for(int l=0;l<pb.length;l++)
			{
				System.out.print(" "+pb[l]);	
				
			}
			System.out.print("\nVetor PC");
			for(int m=0;m<pc.length;m++)
			{
				System.out.print(" "+pc[m]);	
				
			}
		}
	}
}
			