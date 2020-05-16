class exer30{
	public static void main(String[] args) {
		
		int c,i=1,j=2;
		for(c=1;c<=10;c++)
		{
			System.out.print(c+",");
				
			for(i=(c%2==0?2:1);i<=j;i+=2)
			{	

				System.out.print(i+", ");

			}
			j+=2;
			
			

			System.out.println("");
		}
	}
}