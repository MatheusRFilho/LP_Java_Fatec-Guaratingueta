import java.util.Random;
class exer12{
	public static void main(String[] args) {

		int p[],q[],r[] ;
		
	
		Random random = new Random();

		p = new int[10];
		q = new int[15];
		r = new int[25];


		for(int i=0;i<q.length;i++)
		{
			if(i<10)
			{
			p[i]=random.nextInt(50);
			q[i]=random.nextInt(50);
			r[i]=p[i];
			r[i+p.length]=q[i];
			}
			else
			{
			q[i]=random.nextInt(50);
			r[i+p.length]=q[i];	
			}

			

		}	
		for(int j=0;j<1;j++)
		{
			System.out.print("Vetor P");
			for(int k=0;k<p.length;k++)
			{
				System.out.print(" "+p[k]);	
				
			}
			System.out.print("\nVetor Q");
			for(int l=0;l<q.length;l++)
			{
				System.out.print(" "+q[l]);	
				
			}
			System.out.print("\nVetor r");
			for(int m=0;m<r.length;m++)
			{
				System.out.print(" "+r[m]);	
				
			}
		}
	}
}
			