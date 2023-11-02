public class Rectangulo implements Forma {
    private double base;
    private double altura;
    private double area;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        area = base*altura;
        return area;
    }
}
