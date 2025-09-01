import java.util.*;
public class Better {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(hs.contains(-(nums[i]+nums[j]))){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-(nums[i]+nums[j]));
                    Collections.sort(temp);
                    result.add(temp);
                    // left++;
                    // right++;
                }
                else{
                    hs.add(nums[j]);
                    // j++;
                    
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(result);
        return ans;
    }
}

// THis is better solution as the brute force solution is simple 3 for loops 