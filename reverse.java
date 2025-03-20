import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int le = 0;
		int ri = arr.length - 1;
		while(le < ri){
		    int temp = arr[le];
		    arr[le] = arr[ri];
		    arr[ri] = temp;
		    le++;
		    ri--;
		}
		System.out.println(Arrays.toString(arr));
	}
}