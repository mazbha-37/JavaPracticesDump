import java.util.HashMap;

public class twosum217 {
    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;

        int[] answer = new int[2];

        HashMap<Integer, Integer> collection = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int difference = target - nums[i];
            if (collection.containsKey(difference)){
                answer = new int[]{collection.get(difference),i};
            }
            else{
                collection.put(nums[i],i);
            }

        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);





    }
}
