class Solution {
public:
    bool detectCapitalUse(std::string word) {
        int n = word.size();
        int countUpper = 0;
        int countLower = 0;
        
        if (n == 1) {
            return true;
        }

        for (int i = 0; i < n; ++i) {
            if (word[i] >= 'A' && word[i] <= 'Z') {
                countUpper++;
            } else if (word[i] >= 'a' && word[i] <= 'z') {
                countLower++;
            }
        }

        if (countLower == n) {
            return true;
        }
        if (countUpper == n) {
            return true;
        }
        if (countUpper == 1 && word[0] >= 'A' && word[0] <= 'Z' && countLower == n - 1) {
            return true;
        }

        return false;
    }
};
