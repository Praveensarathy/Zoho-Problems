package zoho;

public class StringOfInteger {

	public static void main(String[] args) {
		int i=0,j,n=1024;
		int m=n/2,flag=1;
		for(i=0;i<n;i++) {
			if(i>2) {
			if(prime(i) && prime(n)) {
				System.out.println(i + " ," + n);
				break;
				}
			}
			n--;
		}
		System.out.println("finish");
		
	}
	public static boolean prime(int k) {
		int i,m = k/2;
		for(i=2;i<m;i++) {
			if(k%i==0) {
				return false;
			}
		}
		return true;
	}	
}
