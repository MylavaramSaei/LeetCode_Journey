int mySqrt(int x) {
    if (x < 2) return x;

    int left = 1, right = x / 2, ans = 0;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if ((long long)mid * mid == x) {
            return mid;
        } else if ((long long)mid * mid < x) {
            ans = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return ans;
}
