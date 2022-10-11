
public class firstOccurence {

	public static void main(String[] args) {
		String s1 = "tes123145ting12";
        String s2 = "1234";
        int i,j=0;
        for(i=0;i<(s1.length()-s2.length());i++) {
        	j=0;
        	if(s1.charAt(i)==s2.charAt(j)) {
        		int m = i;
        		while(j <s2.length()) {
        			if(s1.charAt(m++)!=s2.charAt(j)) {
        				break;
        			}
        			j++;
        		}
        		if(j==s2.length()) {
        			System.out.println(i);
        			return;
        		}
        	}
        }
        System.out.println(-1);
	}

}
