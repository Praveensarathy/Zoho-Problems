package techJack;

import java.util.Scanner;

public class PetrolBunk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Petrol in My car:");
		int curPetrol = sc.nextInt();
		int p =3;
		int[] bunkKm = {1,5,3};
		int[] bunkCap = {0,1,2};
		int i =0;
		while(i < p) {
			curPetrol = curPetrol - bunkKm[i];
			curPetrol += bunkCap[i];
			if(curPetrol <=0) {
				System.out.println("Empty Tank..:(");
				return;
			}
			i++;
		}
		
		System.out.println("Remaining petrol: " + curPetrol);
		

	}

}
