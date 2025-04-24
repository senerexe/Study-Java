package a;

public class IfveElseBlokları {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 25;
		
		if(a==b) {
			System.out.println("A ve B sayıları eşittir");
		}
		else {
			System.out.println("A ve B sayıları eşit değildir");
		}
		
		if(b==c) {
			System.out.println("B ve C sayılari eşittir");
		}
		else if(a>c) {
			System.out.println("A sayısı C sayısından büyüktür");
		}
		else {
			System.out.println("B ve C sayıları eşit değildir");
		}
		if((a<c) && (a<b)) {
			System.out.println("A en küçük sayıdır");
		}
		else if((c<b) && (c<b)) {
			System.out.println("C en küçük sayıdır");
		}
		else {
			System.out.println("B en küçük sayıdır");
		}
		if(a==10){
			System.out.println("A sayısı 10'a eşittir");
		}

	}

}
