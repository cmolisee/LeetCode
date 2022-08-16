import java.util.*;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            int k = nums.length - 1;

            if (nums[i] > 0 || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    ++j;
                    --k;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    ++j;
                } else {
                    --k;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
