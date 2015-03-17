package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,3,4,2,1,5,7,3,8,6};
		sort(arr);
		
		for(int i=0; i< arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	/*
	 * merge sorts the array
	 */
	public static void sort(int[] arr){
		if(arr == null){
			return;
		}
		
		int len = arr.length;
		if(len < 2){
			return;
		}
		
		int mid = len/2;
		
		int[] leftarr = new int[mid];
		int[] rightarr = new int[len-mid];
		
		for(int i=0; i<mid; i++){
			leftarr[i] = arr[i];
		}
		for(int j=mid; j<len; j++){
			rightarr[j-mid] = arr[j];
		}
		
		sort(leftarr);
		sort(rightarr);
		
		merge(leftarr, rightarr, arr);
	}
	
	public static void merge(int[] left, int[] right, int[] arr){
		if(arr.length < left.length + right.length){
			throw new IllegalArgumentException("Merged array has smaller length than sum of imput arrays");
		}
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length){
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length){
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length){
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
