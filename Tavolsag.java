import java.util.Scanner; 
import java.lang.Math;

class Homer {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

	double magassag, szog;
	
	System.out.print("Magassag: ");
	magassag = scan.nextInt();
	
	System.out.print("Szog: ");
	szog = scan.nextInt();

    double tavolsag = magassag / (Math.sin(szog));
    
    System.out.printf("Tavolsag: %.3f", tavolsag);

	}
}