import java.util.Random;
class exer13{
	public static void main(String[] args) {

		int p[],q[],r[] ;
		int aux=0,m=0,n=0;
	
		Random random = new Random();

		n=random.nextInt(11);
		m=random.nextInt(16);

		p = new int[n];
		q = new int[m];
		r = new int[p.length+q.length];


		for(int i=0;i<p.length;i++)
		{
			p[i]=random.nextInt(50);
			r[aux]=p[i];
			aux++;
		}
		for(int i=0;i<q.length;i++)
		{
			q[i]=random.nextInt(50);
			r[aux]=q[i];
			aux++;
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
			for(int i=0;i<r.length;i++)
			{
				System.out.print(" "+r[i]);	
				
			}
		}
	}
}
			