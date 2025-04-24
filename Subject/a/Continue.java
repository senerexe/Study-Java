package a;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=10 ; i++) {
			if(i==4 || i==9) {
				System.out.println("atladı=" + i);
			continue;
			}
			System.out.println("i=" + i);
		}
	}

}
