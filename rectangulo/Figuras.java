//Héctor Ramírez Gómez
//Mediante cliclos o bucles genera la impresion de un triangulo recto de numeros
//Ejercicio 1
package rectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figuras {

    int b, h;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Base: ");
        String base = br.readLine();
        int b = Integer.parseInt(base);

        System.out.print("Altura: ");
        String altura = br.readLine();
        int h = Integer.parseInt(altura);
        Rectangulo rectangulo = new Rectangulo(b, h);
        rectangulo.area();
        System.out.println("Área del rectángulo de base: " + b + " por la altura: " + h + " es igual a: " + rectangulo.getAreaRectangulo());

    }
}
