class Solution {
public:
    int longestBalanced(string s) {
        int max_len = 0;

        for (int i = 0; i < s.size(); i++) {

            unordered_map<char, int> mp;

            for (int j = i; j < s.size(); j++) {

                mp[s[j]]++;

                int curr = mp.begin()->second;
                bool allEqual = true;

                for (auto& [k, v] : mp) {
                    if (v != curr) {
                        allEqual = false;
                        break;
                    }
                }

                if (allEqual) {
                    max_len = max(max_len, j - i + 1);
                }
            }
        }

        return max_len;
    }
};
