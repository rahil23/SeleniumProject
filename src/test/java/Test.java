import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String s1 = "Listena";
        String s2 = "Silent";
        boolean flag = true;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (s1.length() == s2.length()) {
            char ch1[] =s1.toCharArray();
            char ch2[] =s2.toCharArray();
            for (int i = 0; i < s1.length(); i++) {

                if(map1.containsKey(ch1[i]))
                {
                    map1.put(ch1[i],map1.get(ch1[i])+1);
                }
                else
                {
                    map1.put(ch1[i],1);
                }
            }
            for (int j = 0; j < s2.length(); j++) {

                if(map2.containsKey(ch2[j]))
                {
                    map2.put(ch2[j],map2.get(ch2[j])+1);
                }
                else
                {
                    map2.put(ch2[j],1);
                }
            }
            Iterator<Map.Entry<Character,Integer>> it  = map1.entrySet().iterator();
            Iterator<Map.Entry<Character,Integer>> it2  = map2.entrySet().iterator();
            while(it2.hasNext())
            {
                Map.Entry<Character,Integer> entry = it.next();
                Map.Entry<Character,Integer> entry2 = it2.next();
                if(map2.containsKey(entry2.getKey()))
                {
                 Integer first =  entry2.getValue();
                 Integer second = entry.getValue();
                 if(first.equals(second))
                 {
                     flag=true;
                 }
                 else {
                     flag=false;
                     break;
                 }
                }

            }
            System.out.println("the result of anagram is"+flag);
        }

        else
        {
            System.out.println("it's not anagram");
        }
    }

}
