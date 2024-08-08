package neetcode.other;

public class S5_IndexOfFirstOccuranceInASortedArray {
    public static void main(String[] args) {
        int[] arr =  {1,3, 4, 4, 4, 4, 9};
        int target = 4;
        System.out.println(firstOccuranceOfTarget(arr, target));
    }

    public static int firstOccuranceOfTarget(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int mid, ans = -1;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        return ans;
    }
}

