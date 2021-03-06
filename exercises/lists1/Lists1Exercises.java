public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList Q, ptr1 = L, ptr2;
        int size = L.size();
        Q = new IntList(ptr1.first + x, null);
        ptr2 = Q;
        for (int i = 1; i < size; i += 1) {
          ptr1 = ptr1.rest;
          ptr2.rest = new IntList(ptr1.first + x, null);
          ptr2 = ptr2.rest;
        }
        return Q;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList Q = L;
        int size = L.size();
        for (int i = 0; i < size; i += 1) {
          Q.first += x;
          Q = Q.rest;
        }
        Q = L;
        return L;
    }

    public static IntList squareR(IntList L) {
      IntList tmp;
      if (L.rest == null) {
        tmp = new IntList(L.first * L.first, null);
      } else {
        tmp = new IntList(L.first * L.first, squareR(L.rest));
      }
      return tmp;
    }

    public static IntList squareI(IntList L) {
      IntList Q, ptrQ, ptrL = L;
      if (L == null){
        return null;
      }
      Q = new IntList(ptrL.first * ptrL.first, null);
      ptrQ = Q;
      while (ptrL.rest != null) {
        ptrL = ptrL.rest;
        ptrQ.rest = new IntList(ptrL.first * ptrL.first, null);
        ptrQ = ptrQ.rest;
      }
      return Q;
    }

    public static IntList squareDestructiveI(IntList L) {
      IntList ptr = L;
      while (ptr != null) {
        ptr.first = ptr.first * ptr.first;
        ptr = ptr.rest;
      }
      return L;
    }

    public static IntList squareDestructiveR(IntList L) {
      if (L == null) {
        return L;
      } else {
        L.first *= L.first;
        L.rest = squareDestructiveR(L.rest);
        return L;
      }
    }

    public static void printList(IntList L) {
      int size = L.size();
      for (int i = 0; i < size; i += 1) {
        System.out.print(L.get(i) + " ");
      }
      System.out.print("\n");
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));   
        printList(incrList(L, 5));
        printList(dincrList(L, 3));
        printList(squareDestructiveR(L));
        printList(squareR(L));
        printList(squareDestructiveI(L));
        printList(squareI(L));
    }
}