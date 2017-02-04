// Abhinav Bassi
// CS 113 H02
// 31327046

class Pascal {

    public static int[] triangle(int n) {
        
        int[] row = new int[n];
        int[] temp;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                row[i] = 1;
            }
            else if (i == n-1) {
                row[n-1] = 1;
            }
            else {
                temp = Pascal.triangle(n-1);
                row[i] = temp[i] + temp[i-1];
            }
        }
        return row;
    }
}
