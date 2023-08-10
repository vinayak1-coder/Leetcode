class Solution {
    public boolean search(int[] array, int target) {
        if (array == null || array.length == 0) {
			return false;
		}
		int start = 0;
		int end = array.length - 1;
		while (start + 1 < end) {
		  int mid = start + (end - start) / 2;
			if (array[mid] == array[start]) {
				start++;
			} else if(array[mid] == array[end]) {  
				end--;
			} else if (array[mid] > array[start]) { 
			  if (array[mid] >= target && target >= array[start]) { 
			    end = mid;
			  } else { 
			    start = mid;
			  }
			} else {
			  if (target <= array[end] && array[mid] <= target) { 
			    start = mid;
			  } else { 
			    end = mid;
			  }
			}
		}
		if (array[end] == target) {
			return true;
		} else if (array[start] == target) {
			return true;
		}
		return false;
    }
}