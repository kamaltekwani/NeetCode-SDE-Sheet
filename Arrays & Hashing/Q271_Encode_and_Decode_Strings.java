/*
 * Problem Link : https://leetcode.com/problems/encode-and-decode-strings/
 * Solution Link : https://leetcode.com/problems/encode-and-decode-strings/solutions/2761792/java-o-n/
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q271_Encode_and_Decode_Strings 
{
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();
        for(String s : strs)
            sb.append(s.length()).append("#").append(s);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) 
    {
        List<String> result = new ArrayList<String>();
        int index=0;

        while(index < s.length())
        {
            int j = index;

            while(s.charAt(j) != '#')
                j++;

            int length = Integer.parseInt(s.substring(index, j));
            result.add(s.substring(j+1, j+length+1));
            index = j + length + 1;
        }

        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
