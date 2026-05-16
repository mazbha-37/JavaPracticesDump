import java.util.Arrays;

public class firstmissingpositive {

    public static void main(String[] args) {
//        int[] nums = {3,4,-1,1};
        int[] nums = {5,-1,16,1,0,3,-8,2};

        int contains=0;

        for(int i=0; i< nums.length;i++){
            if(nums[i]==1){
                contains=1;
                break;
            }

        }
        if(contains==0){
            System.out.println(1);
        }
        int n1 = nums.length;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>n1){
                nums[i]=1;
            }
        }



        for(int i=0; i<nums.length;i++){
            int num1 = Math.abs(nums[i]);
            if(num1==nums.length){
                nums[0] = -Math.abs(nums[0]);
            }
            else{
                nums[num1] = -Math.abs(nums[num1]);
            }
        }
//        System.out.println(Arrays.toString(nums));

        for(int i=1; i<nums.length;i++){
            if(nums[i]>=0){
                return i;
            }

        }
        if(nums[0]>0){
            return n1;
        }

        return n1+1;







    }
}
