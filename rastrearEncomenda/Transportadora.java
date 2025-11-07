package rastrearEncomenda;

public class Transportadora {
    private Encomenda [] encomendas;
    private int quantidade;

    public Transportadora(){
        encomendas = new Encomenda [10];
        this.quantidade = 0;
    }

    public void adicionarEncomenda(Encomenda encomenda){
        if (quantidade < 10){
           encomendas[quantidade] = encomenda;
           quantidade++;
        } else {
            return;
        }
    }

    public void listarEncomendas(){
        for (int i = 0; i < encomendas.length; i++ ){
            if (encomendas[i] != null )
                encomendas[i].exibirInfo();
            
        }
    }

    public Encomenda buscaPorCodigo (int codigo){
        for (int i = 0; i < encomendas.length; i++){
            if (encomendas[i].getcodigo() == codigo ){
                return encomendas[i];
            }
        }

        return null;
    }


}
