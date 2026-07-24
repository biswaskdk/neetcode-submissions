class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> container = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            // Count character frequencies
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            // Build a unique key
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append('#');
                keyBuilder.append(num);
            }

            String key = keyBuilder.toString();

            // Add to the corresponding group
            container.putIfAbsent(key, new ArrayList<>());
            container.get(key).add(str);
        }

        return new ArrayList<>(container.values());
    }
}