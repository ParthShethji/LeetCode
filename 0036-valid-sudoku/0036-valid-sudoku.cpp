class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<string> seen;

        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board[0].size(); j++) {

                if (board[i][j] == '.') continue;

                string num(1, board[i][j]);

                string s  = "row" + to_string(i) + num;
                string s1 = "col" + to_string(j) + num;
                string s2 = "box" + to_string(i/3) + to_string(j/3) + num;

                if (seen.count(s) || seen.count(s1) || seen.count(s2)) {
                    return false;
                }

                seen.insert(s);
                seen.insert(s1);
                seen.insert(s2);
            }
        }
        return true;
    }
};