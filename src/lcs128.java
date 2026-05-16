import java.util.HashSet;

public class lcs128{


public static void main(String[] args) {

    int[] nums = {1,0,1,2};

    int longestSub = 1;

    HashSet<Integer> numSet = new HashSet<>();

    for(int i=0; i< nums.length;i++){
        numSet.add(nums[i]);
    }

//    System.out.println(numSet);

    for(int numbers: numSet){
        if(numSet.contains(numbers-1)){
            continue;
        }
        else{
            int currentNum = numbers;
            int currentSequence =1;
            while(numSet.contains(currentNum+1)){
                currentSequence+=1;
                currentNum=currentNum+1;

            }
            longestSub = Math.max(currentSequence, longestSub);

        }
    }

    System.out.println(longestSub);

}
}
