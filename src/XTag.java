public class XTag {
    public double egyutthato;
    public String xSzoveg;
    public boolean vanHatvany;
    public String hatvanyJel;
    public int hatvany;

    public XTag next;

    public XTag() {
        this.egyutthato = 1d;
        this.xSzoveg = "";
        this.vanHatvany = false;
        this.hatvanyJel = "";
        this.hatvany = 1;
        this.next = null;
    }

    @Override
    public String toString(){
        return (this.egyutthato >= 0d ? "+" + this.egyutthato : this.egyutthato) +
                (this.xSzoveg != null ? this.xSzoveg : "") +
                (this.vanHatvany ? this.hatvanyJel + this.hatvany : "");
    }
}
