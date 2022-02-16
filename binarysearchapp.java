public class binarysearchapp{
    public static void main(String[] args){
        int [] nums = {0,1,2,3,4,5};
        int target = 7;

        binarysearchapp search = new binarysearchapp();
        search.binarySearch(nums, target);
        System.out.println("Search complete");
    }

    private int binarySearch(int nums[], int target){
        int pivot, left = 0;
        int right = nums.length;

        while(left <= right){
            pivot = left + (right - left) /2;

            if(nums[pivot] == target){
                return pivot;
            }

            if(target < nums[pivot]){
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return left;
    }
}