import java.util.Scanner;

public class Calculadora {
    public static int sumar (int a, int b) {
        return a + b;
    }
    public static int restar (int a, int b) {
        return a - b;
    }
    public static int Multiplicar (int a, int b) {
        return a * b;
    }
    public static int dividir (int a, int b) {
        return a / b;
    }
    public static int obtenerPorTeclado(){
        Scanner scanner = new Scanner(System. in);
        int valor = scanner.nextInt();
        return valor;
    }
    public static void main(String[] args) {
       // Ejemplo multiplicando dos numeros recibidos por teclado
       int resultado = Multiplicar (obtenerPorTeclado(), obtenerPorTeclado());
       System.out.println("Resultado");

    }
}