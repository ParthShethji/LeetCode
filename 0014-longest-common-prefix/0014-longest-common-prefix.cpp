class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string pref = strs[0];

        for (string s : strs) {
            int ptr = 0;
            string curr = pref;
            pref = "";

            while (ptr < s.size() && ptr < curr.size()) {
                if (s[ptr] == curr[ptr]) {
                    pref.push_back(s[ptr]);
                    ptr++;
                } else {
                    break;
                }
            }
        }
        return pref;
    }
};
