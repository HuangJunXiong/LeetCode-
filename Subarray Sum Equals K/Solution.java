public class Solution {
    public int subarraySum(int[] nums, int k) {
//        int sum = 0;
//        int count = 0;
//        int i = 0;
//        int j = 0;
//        while (i < nums.length) {
//            j = i;
//            sum = 0;
//            while (j < nums.length) {
//                sum += nums[j];
//                if (sum == k) {
//                    count++;
//                }
//                j++;
//            }
//            i++;
//        }
        int count = 0;
        int sum = 0;
        if(nums[0] == k)count++;
        if(nums.length > 1){
            for (int i = 1; i < nums.length; i++) {
                sum = 0;
                for (int j = i; j >= 0; j--) {
                    sum += nums[j];
                    if (sum == k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}