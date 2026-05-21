package PraticandoCondicionais;

public record Aluno(double media) {
    public CategorizacaoAluno verificaAluno(){
        if (this.media >= 7.0) {
            return CategorizacaoAluno.Aprovado;
        } else if (this.media >= 5.0 && this.media <= 6.9) {
            return CategorizacaoAluno.Recuperação;
        } else {
            return CategorizacaoAluno.Reprovado;
        }
    }    
}
