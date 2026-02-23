class Solution {
public:
    bool hasAllCodes(string s, int k) {

        int num = (1 << k);   // 2^k

        unordered_set<string> st;

        int ptr = 0;

        while (ptr + k <= s.size()) {

            string window = s.substr(ptr, k);

            st.insert(window);

            ptr++;
        }

        if (st.size() == num)
            return true;

        return false;
    }
};