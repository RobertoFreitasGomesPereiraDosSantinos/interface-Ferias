package interfaces;

public class Produto implements Tributavel, Transportavel {
    
    private String nom;
    private double p;
    private double prc;
    private double prcf;
    private double valf;

    public Produto(String nom, double p, double prc) {
        this.setNom(nom);
        this.setP(p);
        this.setPrc(prc);
    }

    public double getPrcf() {
        return prcf;
    }
    public double getValf() {
        return valf;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getP() {
        return p;
    }
    public void setP(double p) {
        this.p = p;
    }
    public double getPrc() {
        return prc;
    }
    public void setPrc(double prc) {
        this.prc = prc;
    }
    public void calcImpo() {    
        prcf = prc + (prc * IMPOSTO);
    }
    public void calcFret() {      
        valf = prc / p * 0.1;
    }

    @Override
    public String toString() {
        return "Produto [nom=" + nom + ", p=" + p + ", prc=" + prc + ", prcf=" + prcf + ", valf=" + valf + "]";
    }
}
