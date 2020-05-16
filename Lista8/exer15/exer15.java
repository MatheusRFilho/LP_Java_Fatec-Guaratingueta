import java.util.Random;
class exer15{
	public static void main(String[] args) {

		Random random = new Random();

		int s[],t[],u[] ;
		int a=0,b=0;
		int n=random.nextInt(11);
		int m=random.nextInt(16);

		s = new int[n];
		t = new int[m];
		u = new int[s.length+t.length];


		for(int i=0;i<s.length;i++)
		{
			s[i]=random.nextInt(50);
		}
		for(int i=0;i<t.length;i++)
		{
			t[i]=random.nextInt(50);
		}

		for(int k=0;k<u.length;)
		{
			if(a<s.length)
			{
				u[k++]=s[a++];
			}
			if(b<t.length)
			{
				u[k++]=t[b++];
			}
		}
		
			System.out.print("Vetor S");
			for(int i=0;i<s.length;i++)
			{
				System.out.print(" "+s[i]);	
				
			}
			System.out.print("\nVetor T");
			for(int i=0;i<t.length;i++)
			{
				System.out.print(" "+t[i]);	
				
			}
			System.out.print("\nVetor U");
			for(int i=0;i<u.length;i++)
			{
				System.out.print(" "+u[i]);	
				
			}
		}
	}

			