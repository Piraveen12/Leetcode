class Solution {
public:
   static bool compare(string &a,string &b){
        return a+b>b+a;
    }
    string largestNumber(vector<int>& nums) {
        std::vector<std::string> num_str;
        for (int num : nums) {
            num_str.push_back(std::to_string(num));
        }

        std::sort(num_str.begin(), num_str.end(), compare);

         if (num_str[0] == "0") {
            return "0";
        }

        std::string largest;
        for (const std::string& nums_str : num_str) {
            largest += nums_str;
        }

        return largest;
    }
};