package TabuadaMultiplicacao;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int valor){
        for (int i = 0; i <= 10; i++){
            int resultado = i * valor;
            System.out.println(i+" x "+valor+" = "+resultado);
        }
    }
}
