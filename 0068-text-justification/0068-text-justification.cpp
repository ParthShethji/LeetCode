class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        vector<string> ans;
        int ptr = 0;

        while (ptr < words.size()) {
            int i = ptr;
            int total_chars = 0;

            // Step 1: pick words for current line
            while (i < words.size() &&
                   total_chars + words[i].size() + (i - ptr) <= maxWidth) {
                total_chars += words[i].size();
                i++;
            }

            int num_words = i - ptr;
            int spaces = maxWidth - total_chars;
            string line = "";

            // Step 2: build line
            if (i == words.size() || num_words == 1) {
                // left justified
                for (int j = ptr; j < i; j++) {
                    line += words[j];
                    if (j < i - 1) line += " ";
                }
                line += string(maxWidth - line.size(), ' ');
            } else {
                // full justified
                int gaps = num_words - 1;
                int each = spaces / gaps;
                int extra = spaces % gaps;

                for (int j = ptr; j < i; j++) {
                    line += words[j];
                    if (j < i - 1) {
                        int space_count = each + (extra > 0 ? 1 : 0);
                        line += string(space_count, ' ');
                        if (extra > 0) extra--;
                    }
                }
            }

            ans.push_back(line);
            ptr = i;
        }

        return ans;
    }
};