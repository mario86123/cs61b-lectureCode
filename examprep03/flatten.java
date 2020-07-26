// flatten({{1, 2, 3}, {}, {7, 8}}) should return {1, 2, 3, 7, 8}.
public static int[] flatten(int[][] x) {
    int totalLength = 0;
    for (int i = 0; i < x.length; i += 1) {
        totalLength += x[i].length;
    }
    int[] a = new int[totalLength];
    int aIndex= 0;
    for (int j = 0; j < x.length; j += 1) {
        for (int k = 0; k < x[j].length; k += 1) {
            a[aIndex] = x[j][k];
        }
    }
    return a;
}