public class Song {
    private String nazev;
    private String interpret;
    private int delkaS;
    public Song(String nazev, String interpret, int delkaS) {
        this.nazev = nazev;
        this.interpret = interpret;
        this.delkaS = delkaS;
    }



    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getDelkaS() {
        return delkaS;
    }

    public void setDelkaS(int delkaS) {
        this.delkaS = delkaS;
    }
}
