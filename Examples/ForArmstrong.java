package c;

public class ForArmstrong {

	public static void main(String[] args) {
		// Armstrong bulma
		
		int temp, birler, onlar, yuzler, toplam;
		for(int i = 100 ; i<=999 ; i++) {
			temp = i;
			
			birler = temp % 10;
			temp /= 10;
			
			onlar = temp % 10;
			temp /= 10;
			
			yuzler = temp % 10;
			temp /= 10;
			
			toplam = (birler*birler*birler) + (onlar*onlar*onlar) + (yuzler*yuzler*yuzler);
			
			if(toplam == i) {
				System.out.println(i + "bir armstrong sayıdır");
			}
			
		}
		
		
			

	}

}
