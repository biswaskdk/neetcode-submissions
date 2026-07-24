class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!charCount.containsKey(charS)){
                charCount.put(charS, 1);
            }
            else{
                charCount.put(charS, (charCount.get(charS) + 1));
            }
            if (!charCount.containsKey(charT)){
                charCount.put(charT, -1);
            }
            else{
                charCount.put(charT, (charCount.get(charT) - 1));
            }

        }

        for (int Values: charCount.values()){
            if (Values != 0){
                return false;
            }
        }
        return true;
    }
}
