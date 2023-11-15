import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        double area = 0;

        Scanner objSc = new Scanner(System.in);
        System.out.println("ingrese el valor de la base ");

        double base = objSc.nextDouble();

        System.out.println("ingrese el valor de la altura ");

        double altura = objSc.nextDouble();

        area = (base * altura) / 2;
        System.out.println("el area del triangulo es: " + area);
    }

}
