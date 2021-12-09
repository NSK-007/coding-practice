import java.util.*;
class CountFrequency{
	public static void main(String[] args) {
		int[] arr = {5,2,7,7,5,5,2,4,4,3,3,8};
		Arrays.sort(arr);
		int n = arr.length;
		int count=0, index=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				count++;
				System.out.println(arr[i]+"-"+((i+1)-index));
				index = i+1;
			}
		}
		System.out.println(arr[n-1]+"-"+(n-index)); //frequency of elements
		System.out.println("distinctive elements:"+(count+1)); // count of distinct elements present
	}
}
