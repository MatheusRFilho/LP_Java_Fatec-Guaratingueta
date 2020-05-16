import java.util.Random;
class exer2{
	public static void main(String[] args) {

		int b[] = new int 	[15];
		Random random = new Random();

		for(int i=0;i<b.length;i++){
		b[i]=random.nextInt(50);
		}

		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}

		System.out.println("-----------------------");
		
		for(int i=b.length-1;i>=0;i--){
			System.out.println(b[i]);
		}

	}
}