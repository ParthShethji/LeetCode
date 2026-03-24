class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> ans;
        int n = s.size();
        int k = words[0].size();
        int total = words.size();

        unordered_map<string, int> wordMap;
        for (auto w : words) wordMap[w]++;

        for (int i = 0; i < k; i++) {
            int left = i, count = 0;
            unordered_map<string, int> windowMap;

            for (int right = i; right + k <= n; right += k) {
                string word = s.substr(right, k);

                if (wordMap.count(word)) {
                    windowMap[word]++;
                    count++;

                    while (windowMap[word] > wordMap[word]) {
                        string leftWord = s.substr(left, k);
                        windowMap[leftWord]--;
                        left += k;
                        count--;
                    }

                    if (count == total) {
                        ans.push_back(left);
                    }
                } else {
                    windowMap.clear();
                    count = 0;
                    left = right + k;
                }
            }
        }

        return ans;
    }
};