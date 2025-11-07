package rastrearEncomenda;

public class Encomenda {
    private int codigo;
    private String destinatario,endereco,status;

    public Encomenda(int codigo, String destinatario, String endereco, String status){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }

    public int getcodigo(){
        return codigo;
    }

    public void exibirInfo(){
        System.out.println("Encomenda ="+ "\n" +
                "Código: " + codigo + "\n" +
                "Destinatario: " + destinatario + "\n" +
                "Endereço: " + endereco + "\n" +
                "Status: " + status + "\n" +
                ".");
    }

    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }


}
