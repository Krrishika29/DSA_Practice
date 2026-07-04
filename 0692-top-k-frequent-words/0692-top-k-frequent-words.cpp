class Solution {
public:
static bool cmp(pair<string,int> A,pair<string,int> B){
    if(A.second==B.second){
        return A.first>B.first;
    }
    return A.second<B.second;
    
}
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string,int> mp;
        for(int i=0;i<words.size();i++){
            mp[words[i]]++;
        }
        vector<pair<string,int>> vec;
        for(auto i:mp){
            vec.push_back(i);
        }
        sort(vec.begin(),vec.end(),cmp);
        vector<string> ans;
        for(int i=0;i<k;i++){
            ans.push_back(vec[vec.size()-i-1].first);
        }
        return ans;

    }
};