class exer29{
	public static void main(String[] args) {
		
		int c,i=1;
		for(c=1;c<=10;c++)
		{
			System.out.print(c+",");
				
			for(i=(c%2==0?2:1);i<=10;i+=2)
			{	

				System.out.print(i+", ");

			}
			
			
			

			System.out.println("");
		}
	}
}