import java.util.Arrays;

class MoveElementToEnd {
    
    public static int[] solve(int[] nums, int toMove){
        int first = 0, last = nums.length-1;
        while(first<last){
            if(nums[first] == toMove && nums[last] != toMove){
                nums[last] = nums[first]+nums[last]-(nums[first]=nums[last]);
            }
            if(nums[last] == toMove)
                last--;
            if(nums[first] != toMove)
                first++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,3,4,5};
        int index = 3;
        System.out.println(Arrays.toString(solve(nums, index)));
    }
}