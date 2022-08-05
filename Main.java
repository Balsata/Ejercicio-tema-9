public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Jose";
        cliente.edad = 22;
        cliente.telefono = 1166443;

            System.out.println(cliente.edad);
            System.out.println(cliente.telefono);
            System.out.println(cliente.nombre);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Cliente {
    int salario;
}