import java.util.HashMap;
import java.util.Map;

public class permutationofstr567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "a";

        boolean bol = false;

        if(s1.length()>s2.length()){
           bol = false;
            System.out.println(bol);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char str: s1.toCharArray()){
            map.put(str, map.getOrDefault(str,0)+1);

        }
        Map<Character, Integer> window = new HashMap<>();

        int size = s1.length();

        for(int i=0; i<size; i++){
            char ch = s2.charAt(i);
            window.put(ch, window.getOrDefault(ch,0)+1);
        }

//        System.out.println(window);

        if(map.equals(window)){
            bol=true;
            System.out.println(bol);
            return;
        }

        for(int i = size; i<s2.length();i++){

            char charadd = s2.charAt(i);
            window.put(charadd, window.getOrDefault(charadd,0)+1);

            char remove = s2.charAt( i - size);

            window.put(remove, window.get(remove)-1);

            if(window.get(remove)==0){
                window.remove(remove);
            }

            if(map.equals(window)){
                bol=true;
                System.out.println(bol);
                return;
            }
        }
        bol = false;
        System.out.println(bol);







    }
}
