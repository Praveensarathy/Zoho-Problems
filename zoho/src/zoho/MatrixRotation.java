package zoho;

public class MatrixRotation {
	public static void main(String args[]) {
		int[][] arr = { { 1, 2 ,6}, { 3, 4 ,5} , { 7, 8 ,9}};
		
		int i,j,temp;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(i=0;i<arr.length;i++) {
			for(j=i;j<arr[i].length;j++) {
				if(i!=j) {
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}

		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("\n"); 
	}
}
