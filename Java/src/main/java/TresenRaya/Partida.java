package TresenRaya;

public class Partida {
    private char[][] tablero;

    public Partida() {
        this.tablero = new char[3][3];
    }
    public void cargarTablero(){

        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]='-';
            }
        }
    }
    public boolean colocarFicha(int fila, int columna, char jugador){
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3){
            return false;
        }
        if (tablero[fila][columna]!='-'){
            return false;
        }
        tablero[fila][columna] = jugador;
        return true;
    }
    public char getFicha(int fila, int columna){
        return tablero[fila][columna];
    }

    public boolean victoriaFila (){
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][0]!='-'){
                if (tablero[i][0]== tablero[i][1] && tablero[i][1]==tablero[i][2]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean victoriaColumna (){
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[0][i]!='-'){
                if (tablero[0][i]== tablero[1][i] && tablero[1][i]==tablero[2][i]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean victoriaDiagonal(){
        if (tablero[0][0]!='-'){
            if (tablero[0][0] == tablero[1][1]  && tablero[2][2] == tablero[1][1]){
                return true;
            }
        }
        if (tablero[0][2]!='-'){
            if (tablero[0][2] == tablero[1][1]  && tablero[1][1] == tablero[2][0]){
                return true;
            }
        }
        return false;
    }

    public boolean tableroLleno(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]=='-'){return false;}
            }
        }
        return true;
    }

    public boolean empate(){
        return tableroLleno() && !victoriaFila() && !victoriaDiagonal() && !victoriaColumna();
    }
}
