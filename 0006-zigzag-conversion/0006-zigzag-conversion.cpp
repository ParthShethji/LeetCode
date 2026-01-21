class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1 || numRows >= s.size()) return s;
        int row = 0;
        int dir = 1; // 1 
        vector<string> rows(numRows);

        for (char c : s) {
            rows[row].push_back(c);

            if (row == 0) dir = 1;
            else if (row == numRows - 1) dir = -1;

            row += dir;
            }

                string result;
    for (auto &r : rows) result += r;
    return result;

    }
};