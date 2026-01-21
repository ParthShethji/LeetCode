class Solution {
public:
    int strStr(string haystack, string needle) {
        if (needle.empty()) return 0; // Handle empty needle case
        int m = haystack.length();
        int n = needle.length();
        
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substr(i, n) == needle) {
                return i;
            }
        }
        return -1;
    }
};   