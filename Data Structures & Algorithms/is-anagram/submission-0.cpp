class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size()) {
            return false;
        } 

        unordered_map<char, int> m;
        unordered_map<char, int> n;
        for (char c : s) m[c]++;
        for (char c : t) n[c]++;
            
        if (m == n) return true;
        
        return false;
    }
};
