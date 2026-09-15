import java.util.*;
public class Solution {
    
     public boolean containsDuplicateV1(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateV2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

    public boolean isAnagramV1(String s, String t) {
        int arr[] = new int[26];
        // creating an array to store frequency of strings 
        // given string only are from a to z lowercase so I used size 26
        for(int i = 0;i<s.length();i++){
            // getting frequency
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            //reducing frequency if exists
            arr[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<26;i++){
            // if whole array has any frequency left then not valid anagram
            if(arr[i]!=0)
                return false;
        }
        // valid anagram cond
        return true;
    }
    public boolean isAnagramV2(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }

}
