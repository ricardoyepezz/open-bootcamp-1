public class Main {

    public static void main(String[] args) {
        suma(10, 10, 10);
        Coche miCoche = new Coche(5);
        miCoche.agregarPuerta();
        System.out.println("Mi coche ahora tiene " + miCoche.puertas + " puertas");

    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
