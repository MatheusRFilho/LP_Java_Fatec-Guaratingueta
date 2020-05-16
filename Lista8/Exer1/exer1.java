import java.util.Random;
class exer1{
	public static void main(String[] args) {

		int a[] = new int 	[15];
		Random random = new Random();

		for(int i=0;i<a.length;i++){
		a[i]=random.nextInt(50);
		}

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
}