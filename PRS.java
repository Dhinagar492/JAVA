package Pattern;

public class PRS {

	public static void main(String[] args) {
    for(int r=0;r<5;r++) {
    for(int s=0;s<5-r;s++) {
    	System.out.print(" ");
    }
    for(int c=0;c<=r;c++) {
    	System.out.print(c+1);
    }
    System.out.println(); 
    }

	}

}
