package rastrearEncomenda;

public class principalEncomenda {
    public static void main(String[] args){
        Transportadora t = new Transportadora();

        Encomenda encomenda1 = new Encomenda(333, "Herbert Richars", "Rua do gera", "Postado");
        Encomenda encomenda2 = new Encomenda(444, "Zé do bar", "Rua da catuaba", "Em trânsito");
        Encomenda encomenda3 = new Encomenda(555, "Elizabeth", "Rua vincent van gogh", "Entregue");
        Encomenda encomenda4 = new Encomenda(777, "Paul Walker", "Rua skyline", "Em trânsito");
        Encomenda encomenda5 = new Encomenda(888, "Stallone", "Rua rambo", "Postado");

        t.adicionarEncomenda(encomenda1);
        t.adicionarEncomenda(encomenda2);
        t.adicionarEncomenda(encomenda3);
        t.adicionarEncomenda(encomenda4);
        t.adicionarEncomenda(encomenda5);

        t.listarEncomendas();

        Encomenda c = t.buscaPorCodigo(777);
        c.exibirInfo();

        encomenda1.atualizarStatus("Em trânsito");
        encomenda2.atualizarStatus("Postado");
        encomenda3.atualizarStatus("Em trânsito");
        encomenda4.atualizarStatus("Entregue");
        encomenda5.atualizarStatus("Entregue");

        t.listarEncomendas();
    }
}
