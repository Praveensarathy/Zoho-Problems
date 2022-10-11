package zoho;

public class perfectFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l = 1,sum=0,r = 6;
		for(i=l;i<=r;i++) {
			j = 2;			
			System.out.println(i);
			while(i > j) {
				if(i<=1) {
					sum +=i;
				}
				for( k = 2;k<i/2;k++) {
					if(i%k==0) {
						break;
					}
				}
				System.out.println("k is "+k);
				if(k==i/2) {
					System.out.println(i);
					sum +=i;
					break;
				}
				else if(i%j==0) {
					System.out.println(j);
					sum+=j;
				}
				j++;
			}
			System.out.println("\n\n");
		}
		System.out.println(sum);
	}

}
