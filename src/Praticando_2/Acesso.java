package Praticando_2;

public record Acesso(String codigoAcesso) {
    public void verificaAcesso(){
        String codigo = this.codigoAcesso.split("-")[0];
        String nivel = this.codigoAcesso.split("-")[1];
        boolean codigoValido = codigo.equals("2023");
        boolean nivelValido = nivel.equals("1") || nivel.equals("2") || nivel.equals("3");

        if (codigoValido && nivelValido) {
            System.out.println("Acesso permitido. Bem vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. \nMotivo: ");
            if (!codigoValido) {
                System.out.println("- Código de acesso inválido");
            }
            if (!nivelValido) {
                System.out.println("- Nivel de permissão inválido");
            }
            
        }
    }
}
