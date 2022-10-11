package zoho;

public class fissBuss {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + "fisbus");
				continue;
			}
			if(i%3==0) {
				System.out.println(i +"fis");
			}
			else if(i%5==0) {
				System.out.println(i +"bus");
			}
			
		}

	}

}
