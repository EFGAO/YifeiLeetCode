package leetcode49;

import java.util.*;

/**
 * Created by GaoYifei on 4/10/17.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 用List 或者 Map 接口类比较好 ，适合以后维护，更灵活
        List<List<String>> result = new LinkedList<List<String>>();
        Map<String, List<String>> hash = new HashMap<String, List<String>>();
        // Arrays.sort(strs);
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            // System.out.println(key);
            if(!hash.containsKey(key)){
                List<String> temp = new LinkedList<String>();
                temp.add(s);
                hash.put(key, temp);
            }
            else{
                List<String> temp = hash.get(key);
                temp.add(s);
                hash.put(key, temp);
            }
        }
        for(List<String> value: hash.values()){
            result.add(value);
        }
        return result;
    }
}