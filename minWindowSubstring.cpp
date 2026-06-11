#include <bits/stdc++.h>
using namespace std;

string minWindow(const string &s, const string &t) {
    int m = t.size();
    unordered_map<char,int> freq;
    for (char c : t) freq[c]++;

    int l = 0, r = 0, minLen = INT_MAX, cnt = 0;
    int startInd = -1;
    while (r < (int)s.size()) {
        if (freq[s[r]] > 0) cnt++;
        freq[s[r]]--;

        while (cnt == m) {
            if (r - l + 1 < minLen) {
                minLen = r - l + 1;
                startInd = l;
            }
            freq[s[l]]++;
            if (freq[s[l]] > 0) cnt--;
            l++;
        }
        r++;
    }
    return startInd == -1 ? string("") : s.substr(startInd, minLen);
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s, t;
    if (!getline(cin, s)) return 0;
    if (!getline(cin, t)) return 0;

    cout << minWindow(s, t) << '\n';
    return 0;
}
