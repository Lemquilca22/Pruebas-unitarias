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
    @Test
    void testTieneNumero(){
        Contraseña password = new Contraseña();

        password.cargarContreña("contra1234");
        assertTrue(password.tieneNumero(),"Tu contraseña necesita minimo 1 caracter numérico");
    }

    @Test
    void testTieneEspacio(){
        Contraseña password = new Contraseña();

        password.cargarContreña("contra1234");
        assertTrue(password.noTieneEspacios(),"Tu contraseña no debería tener espacios vacios");
    }

    @Test
    void testContraseñaSegura(){
        Contraseña password = new Contraseña();

        password.cargarContreña("Tumb4l4c4s4m4m1");
        assertTrue(password.contraseñaSegura(),"Para ser valida debe tener 1 caracter en Mayuscula, 1 valor numerico y tener un minimo de 8 caracteres y 0 espacios vacios");

    }@Test
    void testCadenaVacia(){
        Contraseña password = new Contraseña();

        password.cargarContreña("");
        assertTrue(password.contraseñaSegura(),"Una cadena vacia no puede ser una contraseña segura");
    }
}
