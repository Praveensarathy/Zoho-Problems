import java.util.Arrays;

public class IPaddress {

	public static void main(String[] args) {
		String s = "222.111.111.111";
		int n,flag =0;
		String[] str = s.split("\\.");
		for(String i : str) {
			n = Integer.parseInt(i);
			if(n <=255 && n >= 0 ) {
				flag =1;
			}
			else {
				flag = 0;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("done");
		}
		else {
			System.out.println("Wrong");
		}
	}

}
