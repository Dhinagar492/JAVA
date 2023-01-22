package Pattern;
//NAME PATTERN
public class PatternNames {

		public static void main(String[] args) {
			for(int i = 0;i<7;i++) {
				for(int j = 0;j<7;j++) {
					if(j==0 || j==6 || i==0 || i==6 ) {
					if(j==6 && i==0 || j==6 && i==6 ) {
							System.out.print("  ");
						}
					else {
						System.out.print("* ");
					}
					}
					else {
					System.out.print("  ");
					}
				}
				System.out.println();
			}
	       System.out.println("--------------");
	       //The above for loop is used to print pattern D
	       for(int i = 0;i<7;i++) {
	    	   for(int j = 0;j<7;j++) {
	    		 if(j==0 || j==6 || i==3) {
	    			 System.out.print("* "); 
	    		 }
	    		 else {
	    			 System.out.print("  ");
	    		 }
	    		   }
	    	   System.out.println();		   
	    	   }
	       System.out.println("--------------");
	       //The above for loop is used to print pattern H
	       for(int i = 0;i<7;i++) {
	    	   for(int j = 0;j<7;j++) {
	    		   if(i==0 || i==6 || j==3) {
	    			   System.out.print("* ");
	    		   }
	    		   else {
	    			   System.out.print("  ");
	    		   }
	    	   }
	    	   System.out.println();
	       }
	       System.out.println("--------------");
	     //The above for loop is used to print pattern I
	       for(int i = 0;i<7;i++) {
	    	   for(int j = 0;j<7;j++) {
	    		   if(j==0 || j==6 || j==5 && i==5 || j==1 && i==1 || j==2 && i==2 || j==3 && i==3 || i==4 && j==4) {
	    			   System.out.print("* ");
	    	   }
	    	   else 
	    	   {
	    		   System.out.print("  ");
	    	   }
	       }
	    	   System.out.println();
	    
	       }
	       System.out.println("--------------");
	     //The above for loop is used to print pattern N
		   for(int i = 0;i<7;i++) {
			   for(int j = 0;j<7;j++) {
				   if( j==0 || j==6 || i==0 || i==3) {
					   if(i==0 && j==0) {
						   System.out.print(" ");
					   }
					   else {
					   System.out.print("* ");
				   }
				   }
				   else {
				   System.out.print("  ");
			   }
				 
		   }
			   System.out.println();
		   }
		   System.out.println("--------------");
		 //The above for loop is used to print pattern A
		   for(int i=0;i<7;i++) {
			   for(int j=0;j<7;j++) {
				   if(j==0||i==0||i==6||i==5&&j==5||i==4&&j==5||i==3&&j==5||i==3&&j==4||i==3&&j==3) {
					   if(i==0 && j==0 || i==6 && j==0 || i==6 && j==6 ){
						   System.out.print(" ");
					   }
					   else {
						   System.out.print("* "); 
					   }
				   }
					   else {
						   System.out.print("  ");
					   }
					   }
			   System.out.println();
		}
		   System.out.println("--------------");
		   //The above for loop is used to print pattern G
		   for(int i = 0;i<7;i++) {
			   for(int j = 0;j<7;j++) {
				   if( j==0 || j==6 || i==0 || i==3) {
					   if(i==0 && j==0) {
						   System.out.print(" ");
					   }
					   else {
					   System.out.print("* ");
					   }
				   }
				   else {
				   System.out.print("  ");
			   }
				 
		   }
			   System.out.println();
		   }
		   System.out.println("--------------");
		 //The above for loop is used to print pattern A
		   for(int i = 0;i<7;i++) {
			   for(int j = 0;j<7;j++) {
				   if(j==0||i==0||i==1&&j==6||i==2&&j==6||i==3&&j==5||i==3&&j==4||i==3&&j==3||i==3&&j==2||i==3&&j==2||i==3&&j==1||i==4&&j==2||i==5&&j==3||i==6&&j==4||i==6&&j==5) {
					   if(i==0 && j==0) {
						   System.out.print(" ");
					   }
					   else {
					   System.out.print("* ");
					   }
				   }
				   else {
				   System.out.print("  ");
			   }
				 
		   }
			   System.out.println();
		   }
		}
		//The above for loop is used to print pattern R
}
