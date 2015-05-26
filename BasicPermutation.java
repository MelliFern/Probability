import java.util.Scanner;


public class BasicPermutation {
	public static int N ; 
	
	public static void getPermutation(int array[], int idx){
		int temp; 
		if(idx == N){
			for(int i=0; i<N; i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}else{
			for(int i=idx; i<N; i++){
				temp = array[idx]; array[idx] = array[i]; array[i] = temp;
				getPermutation(array, idx+1);
				temp = array[idx]; array[idx] = array[i]; array[i] = temp;
			}	
		}
	}

	public static void getPermutationCount(){
		long purmutationVal = 1; 
		
		for(int i=1; i<=N; i++)
			purmutationVal = purmutationVal * i;
		
		System.out.println("purmutation:"+purmutationVal);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int arr[] = new int [N];
		for(int i=0; i<N; i++)
			arr[i] = in.nextInt();
		
		getPermutation(arr, 0);
		getPermutationCount();

	}

}
