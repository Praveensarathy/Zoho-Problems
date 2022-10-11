package zoho;
import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
	 public static void main(String[] args) {
 	    int a[] = {9,5,6,4,8,2,3,1,7};
 	    System.out.println(Arrays.toString(mergeSort(a)));
	 }
	 public static int[] mergeSort(int []a) {
		 if(a.length == 1) {
			 return a;
		 }
		 int mid = a.length/2;
		 int left[] = mergeSort(Arrays.copyOfRange(a, 0, mid));
		 int right[] = mergeSort(Arrays.copyOfRange(a, mid, a.length));
		
		 return merge(left,right);
	 }
	 
	private static int[] merge(int[] l, int[] r) {
		
		int g = Integer.MAX_VALUE;
		
		int n = l.length;
		int m = r.length;
		int temp[] = new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(l[i] < r[j]) {
				temp[k++] = l[i];
				i++;
			}
			else {
				temp[k++] = r[j];
				j++;
			}
		}
		while(i<n) {
			temp[k++] = l[i++];
		}
		while(j<m) {
			temp[k++] = r[j++];
		}
		return temp;
		
	}
}