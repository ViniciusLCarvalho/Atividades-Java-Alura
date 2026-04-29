package Praticando_2;

public record Semana(String dia) {
    public void verificaDiaUtil(){
        if (this.dia.equals("segunda") || this.dia.equals("terca") || 
            this.dia.equals("quarta") || this.dia.equals("quinta") || 
            this.dia.equals("sexta")) {
            System.out.println(dia +" é um dia util");
        } else {
            System.out.println(dia +" não é um dia util");
        }
    }
}
