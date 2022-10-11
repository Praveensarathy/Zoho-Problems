
public class Xpattern {

	public static void main(String[] args) {
		int i =0,j=0;
		String s ="PROGRAM";
		for(i=0;i<s.length();i++) {
			for(j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i));
				}
				else if(j+i == s.length()-1)
					System.out.print(s.charAt(j));
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
