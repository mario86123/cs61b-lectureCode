public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
   }

    /** Non-destructively creates a copy of x that contains no occurences of y.
     * A: 5 -> 7 -> 9 -> 3 -> 1 -> 4 -> 9 -> 2
     * ilsans(A, 9)
     * A: 5 -> 7 -> 3 -> 1 -> 4 -> 2
    */
    public static IntList ilsans(IntList x, int y) {
        if (x == null) {
            return null;
        }
        if (x.first == y) {
            return ilsans(x.rest, y);
        }
        return new IntList(x.first, ilsans(x.rest, y)) ;
    }

    /** Destructively modify and return x to contain no occurences of y, without using the keyword "new". */
    public static IntList dilsans(IntList x, int y) {
        if (x == null) {
            return null;
        }
        x.rest = dilsans(x.rest, y)
        if (x.first == y) {
            return x.rest;
        }
        return x;
    }
}