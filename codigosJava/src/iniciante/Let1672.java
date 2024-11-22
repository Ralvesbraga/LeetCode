public class Let1672 {
    public int maximumWealth(int[][] accounts) {
        int s;
        int r = 0;
        for (int i = 0; i < accounts.length; i++) {
            s = 0; 
            for (int j = 0; j < accounts[i].length; j++) {
                s += accounts[i][j];
            }
            if (r == 0) {
                r = s;
            }else{
                if (s >= r) {
                    r = s;
                }
            }
        }
        return r;
    }
}
