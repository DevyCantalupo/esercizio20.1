public class esercizio20di1 {
    public static void main(String[] args) {
        Triangulo miTriangulo = new Triangulo(10, 5);
        Rectangulo miRectangulo = new Rectangulo(10, 5);

        System.out.println("Area el Triangulo: " + miTriangulo.calcularArea());
        System.out.println("Area el Rectangulo: " + miRectangulo.calcularArea());
    }
}
