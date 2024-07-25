class Solution {
public:
  static bool customSort(const std::pair<int, int>& a, const std::pair<int, int>& b) {
        if (a.second != b.second)
            return a.second < b.second; 
        return a.first > b.first;       
    }

    std::vector<int> frequencySort(std::vector<int>& nums) {
        std::unordered_map<int, int> freqMap;

         for (int num : nums) {
            freqMap[num]++;
        }

         std::vector<std::pair<int, int>> freqVec(freqMap.begin(), freqMap.end());

         std::sort(freqVec.begin(), freqVec.end(), customSort);

         std::vector<int> result;
        for (const auto& pair : freqVec) {
            result.insert(result.end(), pair.second, pair.first);
        }

        return result;
    }
};