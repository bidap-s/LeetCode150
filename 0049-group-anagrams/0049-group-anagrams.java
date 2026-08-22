import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> group = map.get(key);
            if (group == null) {
                group = new ArrayList<>();
                map.put(key, group);
            }
            group.add(word);
        }

        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}