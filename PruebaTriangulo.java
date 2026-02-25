import java.util.Scanner;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el lado 1 del triangulo: ");
        double lado1 = entrada.nextDouble();
        
        System.out.print("Introduce el lado 2 del triangulo: ");
        double lado2 = entrada.nextDouble();
        
        System.out.print("Introduce el lado 3 del triangulo: ");
        double lado3 = entrada.nextDouble();

        System.out.print("Introduce el color del triangulo: ");
        String color = entrada.next();

        System.out.print("¿El triangulo esta relleno? (escribe true o false): ");
        boolean relleno = entrada.nextBoolean();

        Triangulo miTriangulo = new Triangulo(lado1, lado2, lado3);
        miTriangulo.setColor(color);
        miTriangulo.setRelleno(relleno);

        System.out.println("\n--- Propiedades del Triangulo ---");
        System.out.println(miTriangulo.toString());
        System.out.println("Area: " + miTriangulo.getArea());
        System.out.println("Perimetro: " + miTriangulo.getPerimeter());
        System.out.println("Color: " + miTriangulo.getColor());
        System.out.println("Relleno: " + miTriangulo.isRelleno());

        entrada.close();
    }
}
