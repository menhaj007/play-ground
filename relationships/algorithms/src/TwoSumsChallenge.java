import java.util.HashSet;
import java.util.Set;

public class TwoSumsChallenge {
    /*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
     */
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int negNums[] = {-1,-2,-3,-4,-5};
        int negTarget = -8;
        int target = 9;
        twoSum(negNums, negTarget);
    }
//    public int[] twoSum(int[] nums, int target)
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> indices = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("i = " + i + " j = " + j);
                    System.out.println(nums[i] + nums[j]);
                    indices.add(i);
                    indices.add(j);
                }
            }
        }
        int[] result = new int[indices.size()];
        int index = 0;
        for (Integer num: indices) {
            result[index++] = num;
        }
        for(int neg: nums) {
            System.out.println("neg index: " + neg);
        }
        return result;
    }
}
