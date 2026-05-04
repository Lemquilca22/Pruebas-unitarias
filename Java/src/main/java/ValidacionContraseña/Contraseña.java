package ValidacionContraseña;

import java.util.ArrayList;

public class Contraseña {
    private ArrayList<Character> listacaracteres;

    public Contraseña() {
        this.listacaracteres = new ArrayList<>();
    }

    //El proximo meotodo reemplaza al setter por defecto
    //Pasa de String al Array de Caracteres (lo busqué porque olvide como pasar string a char)
    public void cargarContreña(String password){
        this.listacaracteres.clear();
        for (char c : password.toCharArray()){
            listacaracteres.add(c);
        }
    }

    public boolean minCaracteres(){
        return listacaracteres.size() >= 8;
    }

    public boolean tieneMayuscula(){
        for (char c : listacaracteres){
            if (Character.isUpperCase(c)){ //Este método comprueba si hay una mayúscula en el array
                return true;
            }
        }
        return false;
    }

    public boolean tieneNumero(){
        for (char c : listacaracteres){
            if (Character.isDigit(c)) return true; //Este método sirve para buscar numeros
        }
        return false;
    }

    public boolean noTieneEspacios(){
        for (char c : listacaracteres){
            if (Character.isWhitespace(c)) return false;
        }
        return true;
    }

    public boolean contraseñaSegura(){
        return minCaracteres() && tieneMayuscula() && tieneNumero() && noTieneEspacios();
    }

}

