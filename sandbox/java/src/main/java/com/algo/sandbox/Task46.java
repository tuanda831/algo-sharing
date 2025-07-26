package com.algo.sandbox;

import java.util.HashMap;
import java.util.Map;

public class Task46 {

    private long countStep = 0;

    public long bruteforce(String l1, String l2) {
        String[] lanes = new String[]{l1, l2};

        long result = Math.max(
                bruteforce(0, 0, 0, true, lanes),
                bruteforce(1, 1, 0, true, lanes)
        );

        return result;
    }

    public long bruteforce(int lastLane, int curLane, int curI, boolean switchLane, String[] lanes) {
        countStep++;
        if (curI == lanes[0].length()) {
            return 0;
        }

        if (lastLane != curLane) {
            return bruteforce(curLane, curLane, curI + 1, false, lanes);
        }

        int countXWhenGoForward = 0;

        if (lanes[(curLane + 1) % 2].charAt(curI) == 'x') {
            countXWhenGoForward++;
        }

        if (!switchLane) {
            return bruteforce(curLane, curLane, curI + 1, false, lanes) + countXWhenGoForward;
        }

        return Math.max(
                bruteforce(curLane, curLane, curI + 1, true, lanes) + countXWhenGoForward,
                bruteforce(curLane, (curLane + 1) % 2, curI, false, lanes)
        );
    }

    public long bruteforceWithMemo(String l1, String l2) {
        String[] lanes = new String[]{l1, l2};
        Map<String, Long> memo = new HashMap<>();

        long result = Math.max(
                bruteforceWithMemo(0, 0, 0, true, lanes, memo),
                bruteforceWithMemo(1, 1, 0, true, lanes, memo)
        );

        return result;
    }

    public long bruteforceWithMemo(
            int lastLane,
            int curLane,
            int curI,
            boolean switchLane,
            String[] lanes,
            Map<String, Long> memo
    ) {
        countStep++;
        if (curI == lanes[0].length()) {
            return 0;
        }

        String memoKey = String.format("%d-%d-%d-%b", lastLane, curLane, curI, switchLane);
        if (memo.containsKey(memoKey)) {
            return memo.get(memoKey);
        }


        if (lastLane != curLane) {
            long result = bruteforceWithMemo(curLane, curLane, curI + 1, false, lanes, memo);
            memo.put(memoKey, result);
            return result;
        }

        int countXWhenGoForward = 0;

        if (lanes[(curLane + 1) % 2].charAt(curI) == 'x') {
            countXWhenGoForward++;
        }

        if (!switchLane) {
            long result = bruteforceWithMemo(curLane, curLane, curI + 1, false, lanes, memo) + countXWhenGoForward;
            memo.put(memoKey, result);

            return result;
        }

        long result = Math.max(
                bruteforceWithMemo(curLane, curLane, curI + 1, true, lanes, memo) + countXWhenGoForward,
                bruteforceWithMemo(curLane, (curLane + 1) % 2, curI, false, lanes, memo)
        );
        memo.put(memoKey, result);

        return result;
    }

    public long dynamicProgramming(String l1, String l2) {
        int n = l1.length();
        final int LANE1 = 0, LANE2 = 1;
        final int NO_SWITCH = 0, CAN_SWITCH = 1;

        long[][][] dp = new long[2][n + 1][2];

        dp[LANE1][n][NO_SWITCH] = 0;
        dp[LANE1][n][CAN_SWITCH] = 0;
        dp[LANE2][n][NO_SWITCH] = 0;
        dp[LANE2][n][CAN_SWITCH] = 0;

        for (int i = n - 1; i >= 0; i--) {
            // Handle Lane 1 logic
            if (l2.charAt(i) == 'x') {
                dp[LANE1][i][NO_SWITCH] = dp[LANE1][i + 1][NO_SWITCH] + 1;
                dp[LANE1][i][CAN_SWITCH] = Math.max(
                        dp[LANE1][i + 1][CAN_SWITCH] + 1,
                        dp[LANE2][i + 1][NO_SWITCH]);
            } else {
                dp[LANE1][i][NO_SWITCH] = dp[LANE1][i + 1][NO_SWITCH];
                dp[LANE1][i][CAN_SWITCH] = Math.max(
                        dp[LANE1][i + 1][CAN_SWITCH],
                        dp[LANE2][i + 1][NO_SWITCH]
                );
            }

            // Handle lane 2 logic
            if (l1.charAt(i) == 'x') {
                dp[LANE2][i][NO_SWITCH] = dp[LANE2][i + 1][NO_SWITCH] + 1;
                dp[LANE2][i][1] = Math.max(
                        dp[LANE2][i + 1][CAN_SWITCH] + 1,
                        dp[LANE1][i + 1][NO_SWITCH]
                );
            } else {
                dp[LANE2][i][NO_SWITCH] = dp[LANE2][i + 1][NO_SWITCH]; //switchLance = false
                dp[LANE2][i][CAN_SWITCH] = Math.max(
                        dp[LANE2][i + 1][CAN_SWITCH],
                        dp[LANE1][i + 1][NO_SWITCH]
                );
            }
        }

        return Math.max(
                Math.max(
                        dp[LANE1][0][NO_SWITCH],
                        dp[LANE1][0][CAN_SWITCH]
                ),
                Math.max(
                        dp[LANE2][0][NO_SWITCH],
                        dp[LANE2][0][CAN_SWITCH]
                )
        );
    }
}

