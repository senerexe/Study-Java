package c;

public class Palindrom {

	public static void main(String[] args) {
		String str = "kapak",tmp="";
		
		
		for(int i = str.length() -1; i >= 0 ; i--) {
			tmp += str.charAt(i);
				
		}
		//System.out.println(tmp);
		if (tmp.equals(str)) {
			System.out.println("Palindromik");
		}

	}

}
