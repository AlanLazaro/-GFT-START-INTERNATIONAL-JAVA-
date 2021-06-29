public class Caixa {
    public double calculaValorFinal(Produto p, int q){
        double valor=0.0;
        if(p.getTipo()==1){
            valor = p.getValor() * q;
            valor -= valor*0.1;
        }

        if(p.getTipo()==2){
            valor = p.getValor() * q;
            valor -= valor*0.2;
        }

        if(p.getTipo()==3){
            valor = p.getValor() * q;
            if(q > 5)
                valor -= valor*0.1;
        }
        return valor;
    }
}
