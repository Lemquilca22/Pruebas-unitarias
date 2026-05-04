package Calculadora;

public class Calculadora {
    private int resultado;

    public Calculadora() {
        this.resultado = 0;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a - b;
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    public int dividir(int a, int b){
        if (!(a==0 || b== 0)){
            return a / b;
        } else {
            return 0;
        }

    }

}
