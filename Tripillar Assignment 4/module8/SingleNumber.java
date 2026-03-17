
// LeetCode 136 – Single Number using XOR

package module8;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            result=result^nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={8,8,7,7,3};
        SingleNumber obj=new SingleNumber();
        System.out.println(obj.singleNumber(arr));
    }
}
