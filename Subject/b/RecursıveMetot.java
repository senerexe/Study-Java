package b;

public class RecursıveMetot {
	
		static int f(int x) {
			int toplam = 0;
			for(int i = 1; i <= 10; i++) {
				toplam+= i;
			}
			
			return toplam;
		}
		static int  r(int x ) {
			if ( x ==  1) {
				return 1;
			}
			return x + r(x-1);
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		// ÖZYİNELEME
		// f(1) = 1
		// f(2) = f(1) + 2
		// f(3) = f(2) + 3
		
		System.out.println(r(10));
	}

}
