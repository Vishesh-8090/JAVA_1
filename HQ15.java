
public class HQ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 5;
		int g = 10;
		int k = 15;
		int a = 20;
		System.out.println("Before Swapping the values");
		System.out.println(w);
		System.out.println(g);
		System.out.println(k);
		System.out.println(a);
		
		/*int temp = a;
		a = w;
		w = g;
		g = k;
		k = temp;*/
		
		w = w+g+k+a;
		a = w-(g+k+a);
		k = w-(g+k+a);
		g = w-(g+k+a);
		w = w-(g+k+a);
		
		System.out.println("After Swapping the values");
		System.out.println(w);
		System.out.println(g);
		System.out.println(k);
		System.out.println(a);
		
	}

}
