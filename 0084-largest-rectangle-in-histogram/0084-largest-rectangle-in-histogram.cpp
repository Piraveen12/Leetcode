class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
       int n = heights.size();
        stack<int> s;
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (s.empty() || heights[i] >= heights[s.top()]) {
                s.push(i++);
            } else {
                int top = s.top();
                s.pop();
                int width = s.empty() ? i : i - s.top() - 1;
                int area = heights[top] * width;
                maxArea = max(maxArea, area);
            }
        }

        while (!s.empty()) {
            int top = s.top();
            s.pop();
            int width = s.empty() ? i : i - s.top() - 1;
            int area = heights[top] * width;
            maxArea = max(maxArea, area);
        }

        return maxArea;
    }
};