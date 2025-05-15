public class XTag {
    public String muvelet;
    public String egyutthato;
    public String xSzoveg;
    public boolean vanHatvany;
    public String hatvanyJel;
    public int hatvany;

    public XTag next;

    public XTag() {
        this.muvelet = "";
        this.egyutthato = "";
        this.xSzoveg = "";
        this.vanHatvany = false;
        this.hatvanyJel = "";
        this.hatvany = 1;
        this.next = null;
    }

    /*public XTag(String egyutthato, String hatvanyjel, float hatvany) {
        this.egyutthato = egyutthato;
        this.hatvanyJel = hatvanyjel;
        this.hatvany = hatvany;
    }
    
    public XTag(String egyutthato) {
        this.egyutthato = egyutthato;
        this.hatvany = 1;
    }
    
    public XTag(String hatvanyjel, float hatvany){
        // this.egyutthato = "";
        this.hatvanyJel = hatvanyjel;
        this.hatvany = hatvany;
    }*/

    @Override
    public String toString(){
        return (this.muvelet != null ? this.muvelet : "") +
                (this.egyutthato != null ? this.egyutthato : "") +
                (this.xSzoveg != null ? this.xSzoveg : "") +
                (this.vanHatvany ? this.hatvanyJel + this.hatvany : "");
    }
}
