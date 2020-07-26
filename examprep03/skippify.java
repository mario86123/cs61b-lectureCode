IntList A = IntList.list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
IntList B = IntList.list(9, 8, 7, 6, 5, 4, 3, 2, 1);
A.skippify(); // A: (1, 3, 6, 10)
B.skippify(); // B: (9, 7, 4)

public class IntList {
    public int first;
    public IntList rest;
    
    @Override
    public boolean equals(Object o) { ... }
    public static IntList list(int... args) { ... }

    public void skippify() {
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for (int i = 0; i < n; i += 1) {
                if (next == null){
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            p = p.rest;
            n += 1;
        }
    }
    ...
}