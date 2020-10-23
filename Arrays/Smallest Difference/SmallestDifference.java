import java.util.Arrays;

class SmallestDifference {

    public static int[] smallDiff(int[] nums1, int[] nums2 ) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, diff = Integer.MAX_VALUE;
        int[] res = new int[2];
        while(i<nums1.length && j<nums2.length){
            if(diff > (int)Math.abs(nums1[i]-nums2[j])){
                diff = (int)Math.abs(nums1[i]-nums2[j]);
                res = new int[]{nums1[i], nums2[j]};
            }

            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                return new int[] {nums1[i], nums2[j]};
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {-1, 5, 10, 20, 28, 3};
        int[] nums2 = {26, 134, 135, 15, 17};
        System.out.println(smallDiff(nums1, nums2)[0]+" "+smallDiff(nums1, nums2)[1]);
    }    
}