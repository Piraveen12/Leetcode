class Solution {
public:
    static int compareSegments(string& version, int& index) {
        int num = 0;
        while (index < version.size() && version[index] != '.') {
            num = num * 10 + (version[index] - '0');
            index++;
        }
        return num;
    }

    static int result(string version1, string version2) {
        int i = 0, j = 0;
        while (i < version1.size() || j < version2.size()) {
            int m1 = compareSegments(version1, i);
            int m2 = compareSegments(version2, j);

            if (m1 > m2) {
                return 1;
            }
            if (m2 > m1) {
                return -1;
            }

            if (i < version1.size() && version1[i] == '.') {
                i++;
            }
            if (j < version2.size() && version2[j] == '.') {
                j++;
            }
        }
        return 0;
    }

    int compareVersion(string version1, string version2) {
        return result(version1, version2);
    }
};
