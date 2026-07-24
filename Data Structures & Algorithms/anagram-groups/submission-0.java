class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> asm = new HashMap<>();
        for(String s: strs ){
            char[] aasm = s.toCharArray();
            Arrays.sort(aasm);
            String key = new String(aasm);
            if(!asm.containsKey(key)){
                asm.put(key, new ArrayList<>());
            }
            asm.get(key).add(s);

        } 
        return new ArrayList<>(asm.values());
    }
}