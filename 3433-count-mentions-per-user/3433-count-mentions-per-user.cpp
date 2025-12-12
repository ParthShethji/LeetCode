#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> countMentions(int numberOfUsers, vector<vector<string>>& events) {
        struct E { long long t; int type; /*0=OFFLINE,1=MESSAGE*/ int id; string mentions; };
        vector<E> ev;
        ev.reserve(events.size());

        // parse events: format: ["TYPE", "timestamp", "third"]
        for (auto &e : events) {
            string typ = e[0];
            long long t = stoll(e[1]);
            if (typ == "OFFLINE") {
                int id = stoi(e[2]);
                ev.push_back({t, 0, id, ""});
            } else { // MESSAGE
                string mentions_str = e[2];
                ev.push_back({t, 1, -1, mentions_str});
            }
        }

        // sort by timestamp, and OFFLINE (0) before MESSAGE (1) at same timestamp
        sort(ev.begin(), ev.end(), [](const E &a, const E &b) {
            if (a.t != b.t) return a.t < b.t;
            return a.type < b.type;
        });

        vector<long long> offline_end(numberOfUsers, LLONG_MIN/4); // offline_end[id] = timestamp when offline period ends
        vector<int> ans(numberOfUsers, 0);

        for (auto &e : ev) {
            long long t = e.t;
            if (e.type == 0) {
                // OFFLINE: user becomes offline for [t, t+60)
                int id = e.id;
                long long endt = t + 60;
                offline_end[id] = max(offline_end[id], endt);
            } else {
                // MESSAGE: handle mentions string
                const string &s = e.mentions;
                if (s == "ALL") {
                    // mentions all users (online or offline)
                    for (int i = 0; i < numberOfUsers; ++i) ans[i]++;
                } else if (s == "HERE") {
                    // mentions all online users at time t
                    for (int i = 0; i < numberOfUsers; ++i) {
                        // user is online at time t if offline_end[i] <= t
                        if (offline_end[i] <= t) ans[i]++;
                    }
                } else {
                    // tokens like "id3 id5 id3" etc.; duplicates count
                    istringstream iss(s);
                    string tok;
                    while (iss >> tok) {
                        // token format assumed "id<number>"
                        if (tok.size() > 2 && tok[0]=='i' && tok[1]=='d') {
                            int id = stoi(tok.substr(2));
                            if (0 <= id && id < numberOfUsers) ans[id]++;
                        }
                    }
                }
            }
        }

        return ans;
    }
};
