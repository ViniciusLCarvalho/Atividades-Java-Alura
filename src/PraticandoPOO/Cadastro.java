package PraticandoPOO;

public class Cadastro {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Cadastro(String nome, String cargo, int nivelAcesso){
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }
    
    void atualizaCad(String novoCargo, int novoNivelAcesso){
        System.out.println("--- Before ---");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Nivel de Acesso: "+nivelAcesso+"\n");

        this.cargo = novoCargo;
        this.nivelAcesso = novoNivelAcesso;

        System.out.println("--- After ---");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Nivel de acesso: "+nivelAcesso);
    }
}
