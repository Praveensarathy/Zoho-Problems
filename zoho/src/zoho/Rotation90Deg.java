package zoho;

import java.util.Arrays;
import java.util.Collections;

public class Rotation90Deg {

	public static void main(String[] args) {
		int mat[][] = {{1, 2}, 
			       {5, 6}};
		int org[][] = mat.clone();
		int n = mat.length;
		int m = mat[0].length;
        int i,j,temp;
        
        
        for(i=0;i<n;i++) {
        	for(j=0;j<m;j++) {
        		System.out.print(mat[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println("\n");
        for(i=0;i<n;i++){
            for(j=i;j<m;j++){
                if(i!=j){
                    temp = mat[i][j];
                    mat[i][j] = mat[j][i]  ;
                    mat[j][i] = temp;
                }
            }
        }
        int arr[] = new int[m];
        int x=2;
        while(x!=0){
            for(i=0;i<n;i++){
                int k=m-1;
                for(j=0;j<m;j++){
                    arr[k--] = mat[i][j]; 
                     }
               // System.out.println(Arrays.toString(arr));
                mat[i] = arr.clone();
                
                 }
                 x--;
            }
        for(i=0;i<n;i++) {
        	for(j=0;j<m;j++) {
        		System.out.print(mat[i][j] + " ");
        	}
        	System.out.println();
        }
	}
}
