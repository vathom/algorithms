int GetMagicIndex(int[] arr, int start, int end)
{
	if(arr == null)
	{
		throw new ArgumentNullException("arr is null");
	}
	
	if(end < start || start < 0 || end >= arr.length)
	{
		return -1;
	}
	
	int mid = (start+end)/2;
	
	if(mid == arr[mid])
	{
		return mid;
	}
	
	else if(mid > arr[mid]) //magic index is not on the left
	{
		return GetMagicIndex(arr, mid+1, end);
	}
	else
	{
		return GetMagicIndex(arr, start, mid-1);
	}
}