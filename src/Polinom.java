public class Polinom {
    //public String nev;
    private XTag head;

    public Polinom() {
        this.head = null;
    }

    public Polinom(String nev) {
        //this.nev = nev;
        this.head = null;
    }

    // Add a term to the end
    public void addTerm(XTag term) {
        if (head == null) {
            head = term;
        } else {
            XTag current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = term;
        }
    }

    // Get the head (optional)
    public XTag getHead() {
        return head;
    }

    // Convert the polynomial to a string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        XTag current = head;
        while (current != null) {
            sb.append(current.toString());
            //if (current.next != null) sb.append(" + ");
            current = current.next;
        }
        return sb.toString();
    }
}
