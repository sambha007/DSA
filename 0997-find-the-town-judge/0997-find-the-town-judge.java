class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustsReceived = new int[n + 1];
        int[] trustsGiven = new int[n + 1];

        for (int[] pair : trust) {
            int a = pair[0];
            int b = pair[1];
            trustsReceived[b]++;
            trustsGiven[a]++;
        }

        for (int person = 1; person <= n; person++) {
            if (trustsReceived[person] == n - 1 && trustsGiven[person] == 0) {
                return person;
            }
        }

        return -1;
       // return n;
    }
}