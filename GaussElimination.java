public class GaussElimination {
    public static void gaussian(double[][] B, int n){
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1;  j++) {
                if (j != 1) {
                    double factor = B[j][i] / B[i][i];
                    for (int k = 0; k <= n + 1; k++) {
                        B[j][k] -= B[j][k] - factor * B[i][k];
                    }
                }
                }    }
    }
}
