import java.util.HashMap;
import java.util.Map;

public class aliendict953 {

    public static void main(String[] args) {

        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < order.length(); i++){
            map.put(order.charAt(i), i);
        }

        for(int i = 0; i < words.length - 1; i++){

            for(int j = 0; j < words[i].length(); j++){

                if(j >= words[i+1].length()){
                    System.out.println(false);
                    return;
                }

                if(words[i].charAt(j) != words[i+1].charAt(j)){

                    int firstLetter = map.get(words[i].charAt(j));
                    int lastLetter = map.get(words[i+1].charAt(j));

                    if(firstLetter > lastLetter){
                        System.out.println(false);
                        return;
                    }

                    break;
                }
            }
        }

        System.out.println(true);
    }
}