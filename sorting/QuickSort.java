package sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {7,6,5,4,3,2,1};//{2,3,1,4,7,6,3,2};
		sort(null);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int[] arr){
		if(arr == null){
			return;
		}
		if(arr.length == 0 || arr.length == 1){
			return;
		}
		
		sort(arr, 0, arr.length-1);
	}
	
	private static void sort(int[] arr, int left, int right){
		if (left > right){
			return;
		}
			
		int indexPartition = partition(arr, left, right);
		sort(arr, left, indexPartition-1);
		sort(arr, indexPartition+1, right);
	}
	
	private static int partition(int[] arr, int left, int right){
		int pIndex = getPartitionIndex(arr, left, right);
		int pValue = arr[pIndex];
		
		moveToEnd(arr, pIndex, right);
		
		int pivotPos = left;
		
		for(int i=left; i< right; i++){
			if(arr[i] < pValue){
				int temp = arr[i];
				arr[i] = arr[pivotPos];
				arr[pivotPos] = temp;
				pivotPos++;
			}
		}
		arr[right] = arr[pivotPos];
		arr[pivotPos] = pValue;
		
		return pivotPos;
	}
	
	private static int getPartitionIndex(int[] arr, int left, int right){
		return (left + right) / 2;
	}
	
	private static void moveToEnd(int[] arr, int indexToMove, int indexMoveTo){
		int temp = arr[indexMoveTo];
		arr[indexMoveTo] = arr[indexToMove];
		arr[indexToMove] = temp;
	}
}
