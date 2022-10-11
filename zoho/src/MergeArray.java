
public class MergeArray {

	public static void main(String[] args) {
		int a[] = {2,4,5,6,7,9,10,13};
		int b[] = { 2,3,4,5,6,7,8,9,11,15};
		
		int i=0,j=0;
		while(i <a.length && j < b.length) {
			if(a[i] < b[j]) {
				if(a[i] == b[j]) {
					System.out.print(a[i] + " ");
					i++;
					j++;
				}
				else {	
					System.out.print(a[i] + " ");
				i++;
				}
			}
			else {
				if(a[i] == b[j]) {
					System.out.print(b[j] + " ");
					i++;
					j++;
				}
				else {	
					System.out.print(b[j] + " ");
				j++;
				}
			}
		}
		while(i<a.length) {
			System.out.print(a[i++] + " ");
		}
		while(j<b.length)
			System.out.print(b[j++] + " ");
	}

}
