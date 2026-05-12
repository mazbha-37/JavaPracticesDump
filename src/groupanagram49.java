import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagram49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, List<String>> collection = new HashMap<>();

        int[] countCharacters = new int[26];

        for (String str: strs){
            Arrays.fill(countCharacters,0);
            for(char c: str.toCharArray()){
                countCharacters[c-'a']+=1;
            }
//            System.out.println(str+"->"+ Arrays.toString(countCharacters) );

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(countCharacters[i]);
            }
            String key = sb.toString();
            if(!collection.containsKey(key)){
                collection.put(key,new ArrayList<>());
            }
            collection.get(key).add(str);
        }
        System.out.println(collection.values());

    }
}
