public class main {
    public static void main(String[] args) {
        Produto p = new Produto("Banana", 0.99, 2);
        Produto p1 = new Produto("Energético", 5.49, 3);
        Produto p2 = new Produto("Arroz", 20.00, 1);
        Produto p3 = new Produto("Chocolate", 4.50, 1);
        Produto p4 = new Produto("Leite", 3.53, 3);
        Produto p5 = new Produto("Abacaxi", 2.40, 2);

        Caixa c = new Caixa();

        System.out.println(c.calculaValorFinal(p,3));
        System.out.println(c.calculaValorFinal(p1,7));
        System.out.println(c.calculaValorFinal(p2,1));
        System.out.println(c.calculaValorFinal(p3,12));
        System.out.println(c.calculaValorFinal(p4,5));
        System.out.println(c.calculaValorFinal(p5,1));
    }
}
