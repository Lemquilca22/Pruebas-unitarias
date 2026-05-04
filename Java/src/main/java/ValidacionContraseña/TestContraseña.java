package ValidacionContraseña;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestContraseña {
    @Test
    void testminCaracteres(){
        Contraseña password = new Contraseña();

        password.cargarContreña("holamama");
        assertTrue(password.minCaracteres(),"Tu contraseña necesita minimo 8 caracteres");
    }

    @Test
    void testMayusculas(){
        Contraseña password = new Contraseña();

        password.cargarContreña("Holamama");
        assertTrue(password.tieneMayuscula(),"Tu contraseña necesita minimo 1 caracter en Mayuscula");
    }
}
