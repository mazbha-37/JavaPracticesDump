import java.util.HashSet;

public class containsduplicate {
    public static void main(String[] args) {
        boolean bol = false;
        int[] numbers = {1,2,3,4,5,6,77};
        HashSet<Integer> collections = new HashSet<Integer>();

        for(int i=0; i<numbers.length; i++){

            if(collections.contains(numbers[i])){
                bol = true;
                break;

            }
            else{
                collections.add(numbers[i]);
            }

        }

        System.out.println(bol);






    }
}
