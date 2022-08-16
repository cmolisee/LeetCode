public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1;

        if (nums.length == 0) {
            return 0;
        }

        if (last == 0) {
            if (nums[last] == val) {
                return 0;
            } else {
                return 1;
            }
        }

        int i = 0;
        while (i < last) {
            if (nums[last] == val) {
                --last;
                continue;
            }

            if (nums[i] == val) {
                int tmp = nums[i];
                nums[i] = nums[last];
                nums[last] = tmp;
                --last;
            }
            ++i;
        }

        return nums[last] == val ? last : ++last;
    }
}
