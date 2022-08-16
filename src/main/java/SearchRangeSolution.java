public class SearchRangeSolution {
    // assume nums is sorted
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int l = 0;
        int r = nums.length - 1;
        // narrow down the array to the section that contains the target(s)
        while (l != r) {
            int m = (l + r) / 2;

            if (l == m) {
                break;
            }

            if (nums[m] < target) {
                l = m;
            } else if (nums[m] > target) {
                r = m;
            } else { // this is the section containing the target(s)
                int ll = l;
                int lr = m;
                // find the left most target
                while (ll != lr) {
                    int lm = (ll + lr) / 2;

                    if (nums[ll] == target) {
                        break;
                    }

                    if (ll == lm) {
                        ll = lr;
                        break;
                    } else if (nums[lm] < target) {
                        ll = lm;
                    } else {
                        lr = lm;
                    }
                }

                int rl = m;
                int rr = r;
                // find the right most target
                while (rl != rr) {
                    int rm = (rl + rr) / 2;

                    if (nums[rr] == target) {
                        break;
                    }

                    if (rl == rm) {
                        rr = rl;
                        break;
                    } else if (nums[rm] > target) {
                        rr = rm;
                    } else {
                        rl = rm;
                    }
                }
                int lv = nums[ll];
                int rv = nums[rr];

                // return the index range of the target(s)
                if (lv != target && rv != target) {
                    break;
                } else if (lv != target) {
                    return new int[]{rr, rr};
                } else if (rv != target) {
                    return new int[]{ll, ll};
                } else {
                    return new int[]{ll, rr};
                }
            }
        }

        // if the array length <= 2 or the target does not exist
        if (nums[l] != target && nums[r] != target) {
            return new int[]{-1, -1};
        } else if (nums[l] != target) {
            return new int[]{r, r};
        } else if (nums[r] != target) {
            return new int[]{l,l};
        } else {
            return new int[]{l, r};
        }
    }
}
