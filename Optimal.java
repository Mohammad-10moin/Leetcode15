import java.util.*;
public class Optimal {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;

        while (i < nums.length - 2) {  // at least 3 numbers required
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // skip duplicates for j
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    // skip duplicates for k
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

            // skip duplicates for i
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
            i++;
        }

        return result;
    }
}