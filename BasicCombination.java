import java.util.Scanner;


public class BasicCombination {
	
	public static void getCombination(String [] shirts, String [] pants, String [] hats){
		int count =0;
		for(int i=0; i<shirts.length; i++)
			for(int j=0; j<pants.length; j++)
				for(int k=0; k<hats.length; k++){
					System.out.println(shirts[i] +" "+ pants[j]+ " "+ hats[k]);
					count++;
				}
		System.out.println("total combinations:"+ count);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int noOfShirts = in.nextInt(); 
		int noOfPants = in.nextInt(); 
		int noOfHats = in.nextInt();
		
		String shirts [] = new String[noOfShirts]; 
		String pants[] = new String[noOfPants];
		String hats[] = new String[noOfHats];
		
		for(int i=0; i<noOfShirts; i++)
			shirts[i] = in.next(); 
		
		for(int i=0; i<noOfPants; i++)
			pants[i] = in.next(); 
		
		for(int i=0; i<noOfHats; i++)
			hats[i] = in.next(); 
		
		
		getCombination(shirts, pants, hats);

	}

}
