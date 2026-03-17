
// LeetCode 78 – Subsets

package module9;
import java.util.ArrayList;
import java.util.List;
public class SubsetProblem {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        //Base case
        if (index >=nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        //Exclude case
        solve(nums, output, index + 1, ans);
        // Include case
        output.add(nums[index]);
        solve(nums, output, index + 1, ans);
        // Backtrack and remove the last answer from the output to go to next
        output.remove(output.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        SubsetProblem solution = new SubsetProblem();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

