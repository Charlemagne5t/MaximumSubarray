import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest{
    @Test
    public void maxSubArrayTest1(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int actual = new Solution().maxSubArray(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSubArrayTest2(){
        int[] nums = {1};
        int expected = 1;
        int actual = new Solution().maxSubArray(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSubArrayTest3(){
        int[] nums = {5,4,-1,7,8};
        int expected = 23;
        int actual = new Solution().maxSubArray(nums);

        Assertions.assertEquals(expected, actual);
    }
}
