package interfaces;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("coleira de cadela", 0.5, 15);
        p.calcFret();
        p.calcImpo();
        System.out.println(p);
    }
}
