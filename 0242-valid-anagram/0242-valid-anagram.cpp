class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> mp;
        for(char c:s){
            mp[c]++;
        }
        unordered_map<char,int> mp2;
        for(char c2:t){
            mp2[c2]++;
        }
        if(mp==mp2){
            return true;
        }
        return false;
    }
};