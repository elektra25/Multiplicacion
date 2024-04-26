import java.util.Scanner;

class MainMultiplicacion {
    public static void main(String[] args) {
        // Declaración de variables
        int a, b, res;
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner op = new Scanner(System.in);
        // Creación de un objeto Multiplicacion
        Multiplicacion mul = new Multiplicacion();
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa un numero");
        // Leer el primer número ingresado por el usuario
        a = op.nextInt();
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa otro numero");
        // Leer el segundo número ingresado por el usuario
        b = op.nextInt();
        // Calcular la multiplicación de los dos números ingresados y asignar el resultado a la variable res
        mul.res = (a * b);
        // Mostrar el resultado de la multiplicación
        mul.mostrarMultiplicacion();
    }
}
