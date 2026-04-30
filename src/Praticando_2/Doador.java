package Praticando_2;

public record Doador(int idade, int peso) {
    public void verificaDoador(){
        int i = this.idade;
        int p = this.peso;
        boolean idadeValida = i >= 18 && i <= 65;
        boolean pesoValido = p > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compativel para doação de sangue");
        } else {
            System.out.println("O doador não é compativel para doação de sangue. \nMotivo");
            if (!idadeValida) {
                System.out.println(" - Deve ter entre 18 e 65 anos");
            }
            if (!pesoValido) {
                System.out.println(" - Deve pesar mais de 50 kg");
            }
        }
    }
}
