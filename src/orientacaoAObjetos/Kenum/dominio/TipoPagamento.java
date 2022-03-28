package orientacaoAObjetos.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto (double valor);//método abstrato não pode ter corpo!!

}
//desta forma evita-se o uso de if else para verificar a forma de pagamento