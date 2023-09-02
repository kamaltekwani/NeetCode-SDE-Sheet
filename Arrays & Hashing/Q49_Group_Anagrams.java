/*
 * Problem Link :https://leetcode.com/problems/group-anagrams/
 * Solution Link : https://leetcode.com/problems/group-anagrams/solutions/1551701/java-tc-o-totalchars-n-sc-o-n-group-by-signature-of-each-string/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q49_Group_Anagrams 
{
    public String buildKey(String s)
    {
        char alphabet[] = new char[26];
        for(char c : s.toCharArray())
            alphabet[c-'a']++;
        return new String(alphabet);
    }

    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String s : strs)
        {
            String key = buildKey(s);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            map.put(key, list);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}
