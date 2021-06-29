public class main {
    public static void main(String[] args) {
        Produto p = new Produto("Banana", 0.99, 2);
        Caixa c = new Caixa();

        System.out.println(c.calculaValorFinal(p,2));
    }
}
