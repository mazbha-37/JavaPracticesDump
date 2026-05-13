import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class topk347 {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }


        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for (int num: map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }

        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = pq.poll();
        }


        System.out.println(Arrays.toString(result));
    }
}
