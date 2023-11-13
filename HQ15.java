
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
	
		g = k;
		k = a;
		w = g;
		a = w;
		
		System.out.println("After Swapping the values");
		System.out.println(w);
		System.out.println(g);
		System.out.println(k);
		System.out.println(a);
	}

}
