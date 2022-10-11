package zoho;

public class SnakePattern {

	 public static void main(String[] args){
	    	int i,j,sum=0,k=12;
	    	int a[][] ={{1,2,3,5},{4,5,6,8},{7,8,9,11}};
	    	
	    	for(i=0;i<a.length;i++) {
	    		if(i%2==0) {
	    			for(j=0;j<a[0].length;j++) {
	    				System.out.print(a[i][j] +" ");
	    			}
	    		}
	    		
	    		else {
	    			for(j=a[0].length-1;j>=0;j--) {
	    				System.out.print(a[i][j] + " ");
	    			}
	    		}
	    		System.out.println();
	    	}
	 }
}
