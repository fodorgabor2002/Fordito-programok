public class Polinom {
    private XTag head;

    public Polinom() {
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

    public double evaluatePolinom(double x) {
        double result = 0.0;
        XTag current = head;

        while (current != null) {
            double termValue;
            if (current.xSzoveg != null && !current.xSzoveg.isEmpty()) {
                int exponent = current.vanHatvany ? current.hatvany : 1;
                termValue = current.egyutthato * Math.pow(x, exponent);
            } else {
                termValue = current.egyutthato; // constant term
            }

            result += termValue;
            current = current.next;
        }

        return result;
    }

    public Polinom deepCopy() {
        Polinom copy = new Polinom();
        XTag current = this.head;
        while (current != null) {
            XTag termCopy = new XTag();
            termCopy.egyutthato = current.egyutthato;
            termCopy.xSzoveg = current.xSzoveg;
            termCopy.vanHatvany = current.vanHatvany;
            termCopy.hatvany = current.hatvany;
            termCopy.hatvanyJel = current.hatvanyJel;
            copy.addTerm(termCopy);
            current = current.next;
        }
        return copy;
    }


    private XTag cloneTerm(XTag original) {
        XTag copy = new XTag();
        copy.egyutthato = original.egyutthato;
        copy.xSzoveg = original.xSzoveg;
        copy.vanHatvany = original.vanHatvany;
        copy.hatvany = original.hatvany;
        copy.hatvanyJel = original.hatvanyJel;
        return copy;
    }

    public Polinom add(Polinom other) {
        Polinom result = new Polinom();

        XTag a = this.head;
        XTag b = other.head;

        while (a != null || b != null) {
            XTag term;

            if (a != null && (b == null || a.hatvany > b.hatvany)) {
                term = cloneTerm(a);
                result.addTerm(term);
                a = a.next;
            } else if (b != null && (a == null || b.hatvany > a.hatvany)) {
                term = cloneTerm(b);
                result.addTerm(term);
                b = b.next;
            } else { // a.hatvany == b.hatvany
                term = cloneTerm(a);
                term.egyutthato = a.egyutthato + b.egyutthato;
                if (term.egyutthato != 0d) result.addTerm(term);
                a = a.next;
                b = b.next;
            }
        }

        return result;
    }

    public Polinom subtract(Polinom other) {
        Polinom negatedOther = other.deepCopy();
        XTag current = negatedOther.head;
        while (current != null) {
            current.egyutthato *= -1;
            current = current.next;
        }
        return this.add(negatedOther);
    }

    public Polinom multiply(Polinom other) {
        Polinom result = new Polinom();

        for (XTag a = this.head; a != null; a = a.next) {
            Polinom temp = new Polinom();
            for (XTag b = other.head; b != null; b = b.next) {
                XTag term = new XTag();
                term.egyutthato = a.egyutthato * b.egyutthato;
                term.xSzoveg = a.xSzoveg; // assumes both use same variable
                term.vanHatvany = true;
                term.hatvany = a.hatvany + b.hatvany;
                term.hatvanyJel = "^";
                temp.addTerm(term);
            }
            result = result.add(temp);
        }

        return result;
    }

    public Polinom[] divide(Polinom divisor) {
        Polinom dividend = this.deepCopy();
        Polinom quotient = new Polinom();

        while (dividend.head != null && dividend.head.hatvany >= divisor.head.hatvany) {
            double coefRatio = dividend.head.egyutthato / divisor.head.egyutthato;
            int expDiff = dividend.head.hatvany - divisor.head.hatvany;

            XTag term = new XTag();
            term.egyutthato = coefRatio;
            term.xSzoveg = dividend.head.xSzoveg;
            term.vanHatvany = true;
            term.hatvany = expDiff;
            term.hatvanyJel = "^";

            Polinom temp = new Polinom();
            temp.addTerm(term);

            Polinom subtract = temp.multiply(divisor);
            dividend = dividend.subtract(subtract);
            quotient.addTerm(term);
        }

        // System.out.println("quotient: " + quotient.toString());
        // System.out.println("dividend: " + dividend.toString());
        return new Polinom[]{quotient, dividend}; // quotient, remainder
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
