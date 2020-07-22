public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;
        
        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }
    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    
    public void insert(int item, int position) {
        IntNode ptr = first, tmp;
        IntNode n = new IntNode(item, null);
        for (int i = 0; i < position - 1 && ptr.next != null; i += 1) {
            ptr = ptr.next;
        }
        tmp = ptr.next;
        ptr.next = n;
        n.next = tmp;
    }

    public void printList() {
        IntNode tmp = first;
        while (tmp != null) {
            System.out.print(tmp.item + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void reverseI() {
        IntNode prev, back;
        if (first == null || first.next == null) {
            return;
        }
        back = first.next;
        first.next = null;
        while (back != null) {
            prev= first;
            first = back;
            back = back.next;
            first.next = prev;
        }
    }

    public void reverseR(IntNode f) {
        if (f.next == null) {
            first = f;
            return;
        }
        reverseR(f.next);
        f.next.next = f;
        f.next = null;
        return;
    }

    public static void main(String[] args) {
        SLList l1 = new SLList();
        for (int i = 0; i < 1; i += 1) {
            l1.addFirst(i);
        }
        l1.printList();
        l1.insert(100, 4);
        l1.printList();
        l1.insert(170, 9);
        l1.printList();
        l1.reverseI();
        l1.printList();
        l1.reverseR(l1.first);
        l1.printList();
    }
}