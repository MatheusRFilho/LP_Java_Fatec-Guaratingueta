import java.util.Random;
class exer14{
	public static void main(String[] args) {

		int s[],t[],u[] ;
		int aux1=0,aux2=0;
	
		Random random = new Random();

		s = new int[10];
		t = new int[15];
		u = new int[25];


			for(int i=0;i<t.length;i++)
				{
					if(i<s.length)
					{
					s[i]=random.nextInt(50);
					t[i]=random.nextInt(50);
					}
					else
					{
					t[i]=random.nextInt(50);
					}
				}	
			for(int i=0;i<u.length;i++)
			{
				if(i%2==0)
				{
					if(i<20)
					{
					u[i]=s[aux1];
					aux1++;
					}
					else
					{
					u[i]=t[aux2];
					aux2++;	
					}
				}
				else{
					u[i]=t[aux2];
					aux2++;
				}
			}
		
			System.out.print("Vetor S");
			for(int k=0;k<s.length;k++)
			{
				System.out.print(" "+s[k]);	
				
			}
			System.out.print("\nVetor T");
			for(int l=0;l<t.length;l++)
			{
				System.out.print(" "+t[l]);	
				
			}
			System.out.print("\nVetor U");
			for(int m=0;m<u.length;m++)
			{
				System.out.print(" "+u[m]);	
				
			}
		}
	}

			