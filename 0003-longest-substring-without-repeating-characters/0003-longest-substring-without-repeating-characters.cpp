class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int max_len  = 0;
        int left = 0;
        string temp = "";
        for(int right =0; right<s.size(); right++){
            char c = s[right];
            while(temp.substr(left).contains(c)){
                left++;
            }
            temp.push_back(c);
            max_len = max(max_len, right-left+1);
        }
        return max_len;
    }
};
