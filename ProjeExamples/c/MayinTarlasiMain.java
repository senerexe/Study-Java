package c;

import java.util.Scanner;

public class MayinTarlasiMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayın Tarlasına Hoşgeldiniz");
		System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz ");
		System.out.print("Satır Sayısı :");
		row = scan.nextInt();
		System.out.print("Sütün Sayısı :");
		column = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();

	}

}
