public class Number_of_Ways_to_Stay_in_the_Same_Place_After_Some_Steps {

        public int numWays(int steps, int arrLen) {
            int[] DP = new int[arrLen + 1];
            int[] temp = null;
            int MOD = 1000000007;
            DP[1] = 1;
            for(int j = 1; j <= steps; j++) {
                temp = new int[arrLen + 1];
                for(int i = 1; i <= arrLen; i++) {
                    if(i == 1 && i == arrLen) {
                        temp[i] = DP[i] % MOD;
                    } else if(i == 1) {
                        temp[i] = (DP[i] + DP[i + 1]) % MOD;
                    } else if(i == arrLen) {
                        temp[i] = (DP[i] + DP[i - 1]) % MOD;
                    } else {
                        temp[i] = (((DP[i] + DP[i - 1]) % MOD) + DP[i + 1]) % MOD;
                    }
                    if(temp[i] == 0) {
                        break;
                    }
                }
                DP = temp;
            }
            return DP[1];
        }

}
