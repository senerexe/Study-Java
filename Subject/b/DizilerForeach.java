package b;

import java.util.Scanner;

public class DizilerForeach {

	public static void main(String[] args) {
		int[] liste = new int[4];
		// int[] liste = 71,2,3,4};
		
		liste[0] = 1;
		liste[1] = 2;
		liste[2] = 3;
		liste[3] = 4;
		
		//System.out.println(liste[3]);
		for(int i = 0; i< liste.length; i++) {
			int value = liste[i];
			System.out.println(liste[i]);	
		}
		System.out.println("-----------");
		//Foreach
		for(int value : liste) {
			System.out.println(value);
		
		}
		
		
	


	}

}
