package zoho;

import java.util.Date;

public class SortDate {

	public static void main(String[] args) {
		int arr[][] = {{20,  1, 2014},
                {25,  3, 2010},
                { 3, 12, 1676},
                {18, 11, 1982},
                {19,  4, 2015},
                { 9,  7, 2015}};
		int[] temp = arr[0];
		
		int i,j,k=0;

		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++) {
				if(j==arr[0].length-1) {
					for(k=i+1;k<arr.length;k++) {
					if(arr[i][j] < arr[k][j]) {
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
						}
					}
				}
			}
		}
		System.out.println(arr[0][2]);
	}
	
}
