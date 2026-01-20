class Solution {
public:
    string reverseWords(string s) {
        int ptr = s.size() - 1;
        string word = "";

        // skip trailing spaces
        while (ptr >= 0 && s[ptr] == ' ') ptr--;

        int end = ptr;

        while (ptr >= 0) {
            if (s[ptr] == ' ') {
                if (end > ptr) {
                    if (!word.empty()) word.push_back(' ');
                    word += s.substr(ptr + 1, end - ptr);
                }
                while (ptr >= 0 && s[ptr] == ' ') ptr--;
                end = ptr;
            } else {
                ptr--;
            }
        }

        // first word
        if (end >= 0) {
            if (!word.empty()) word.push_back(' ');
            word += s.substr(0, end + 1);
        }

        return word;
    }
};
