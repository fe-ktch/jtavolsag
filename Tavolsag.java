/*
* File: Tavolsag.java
* Author: Sangare Fantha Felisha
* Copyright: 2022, Sangare Fantha Felisha
* Group: Szoft I N
* Date: 2022-02-22
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/

import java.util.Scanner; 
import java.lang.Math;

class Tavolsag {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

    System.out.println("----------------------------------");
	System.out.println("Keszitette: Sangare Fantha Felisha\nFeladat: 0349\n2022-02-22, SZOFT I N");
	System.out.println("----------------------------------");

	double magassag, szog;
	
	System.out.print("Magassag: ");
	magassag = scan.nextInt();
	
	System.out.print("Szog: ");
	szog = scan.nextInt();

    double tavolsag = magassag / (Math.sin(szog));
    
    System.out.printf("Tavolsag: %.3f", tavolsag);

	}
}