import java.util.HashMap;
import java.util.Map;

public class isomorphic205 {

    public static void main(String[] args) {
        String s = "egl";
        String t = "add";
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        int i = 0;
        while(i < s.length()){
            if(!map1.containsKey(s.substring(i,i+1)) && !map2.containsKey(t.substring(i,i+1))){

                map1.put(s.substring(i,i+1),t.substring(i,i+1));
                map2.put(t.substring(i,i+1),s.substring(i,i+1));
            }
            else if(map1.containsKey(s.substring(i,i+1)) && map2.containsKey(t.substring(i,i+1))){

                if(!map1.get(s.substring(i,i+1)).equals(t.substring(i,i+1)) ||
                        !map2.get(t.substring(i,i+1)).equals(s.substring(i,i+1))){
                    System.out.println(false);
                    return;
                }
            }
            else{
                System.out.println(false);
                return;
            }
            i++;
        }
        System.out.println(true);
        return;
    }

    }

