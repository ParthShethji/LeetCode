class Solution {
public:
    bool isValidCode(const string& s) {
        for (char c : s) {
            if (!(isalnum(c) || c == '_')) return false;
        }
        return true;
    }

    vector<string> validateCoupons(vector<string>& code,
                                   vector<string>& businessLine,
                                   vector<bool>& isActive) {

        unordered_map<string, vector<string>> mp = {
            {"electronics", {}},
            {"grocery", {}},
            {"pharmacy", {}},
            {"restaurant", {}}
        };

        int n = code.size();
        for (int i = 0; i < n; i++) {
            if (!code[i].empty() && isActive[i] && isValidCode(code[i])) {
                if (mp.count(businessLine[i])) {
                    mp[businessLine[i]].push_back(code[i]);
                }
            }
        }

        for (auto& it : mp) {
            sort(it.second.begin(), it.second.end());
        }

        vector<string> result;
        vector<string> order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for (auto& cat : order) {
            result.insert(result.end(),
                          mp[cat].begin(),
                          mp[cat].end());
        }

        return result;
    }
};
