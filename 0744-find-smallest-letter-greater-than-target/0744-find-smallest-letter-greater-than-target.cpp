class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        char min;
        int target_num = target -'a';
        for(char c : letters){
            int c_num = c-'a';
            if(c_num >target_num){
                return c;
            }
        }
        return letters[0];
    }
};