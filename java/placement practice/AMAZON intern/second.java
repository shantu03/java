import java.util.*;

class second {
    public static void main(String[] args) {
        determineMaxDataFlow(new ArrayList<>(Arrays.asList(5, 4, 8, 4, 7)), 6);
        
    }

    public static long determineMaxDataFlow(List<Integer> bandwidth, long streamCount) {
        int n = bandwidth.size();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = bandwidth.get(i);

        // Sort ascending then reverse to descending
        Arrays.sort(a);
        reverse(a); // <-- our helper below

        // Prefix sums on descending array
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + a[i];

        // Binary search the largest threshold T such that
        // count of pairs (i,j) with a[i] + a[j] >= T is >= streamCount
        long lo = a[n - 1] * 2; // min possible sum
        long hi = a[0] * 2;     // max possible sum
        while (lo < hi) {
            long mid = (lo + hi + 1) / 2;
            if (countPairs(a, mid) >= streamCount) lo = mid;
            else hi = mid - 1;
        }
        long T = lo;

        // Sum of all pairs with sum >= T
        long total = sumPairs(a, pref, T);

        // If we took more than streamCount pairs at threshold T,
        // subtract the excess, each valued exactly T.
        long excess = countPairs(a, T) - streamCount;
        return total - excess * T;
    }

    // Count pairs (i,j) with a[i] + a[j] >= limit.
    // a[] is sorted in DESCENDING order.
    private static long countPairs(long[] a, long limit) {
        int n = a.length;
        long cnt = 0;
        int j = n - 1; // start from smallest and move left
        for (int i = 0; i < n; i++) {
            while (j >= 0 && a[i] + a[j] < limit) j--;
            cnt += (j + 1); // all k in [0..j] work
            if (j < 0) break; // later i will be smaller -> no pairs
        }
        return cnt;
    }

    // Sum of (a[i] + a[j]) over all pairs with sum >= limit.
    // Uses prefix sums for O(n).
    private static long sumPairs(long[] a, long[] pref, long limit) {
        int n = a.length;
        long sum = 0;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && a[i] + a[j] < limit) j--;
            if (j < 0) break;
            // Sum over k = 0..j of (a[i] + a[k]) = (j+1)*a[i] + pref[j+1]
            sum += (j + 1L) * a[i] + pref[j + 1];
        }
        return sum;
    }

    // Helper to reverse a primitive array in-place
    private static void reverse(long[] a) {
        for (int l = 0, r = a.length - 1; l < r; l++, r--) {
            long t = a[l]; a[l] = a[r]; a[r] = t;
        }
    }
}
