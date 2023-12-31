package src.factoryMethod;

import src.singleton.Menu;

import java.util.Scanner;

public class CreadorPeluche implements CreadorJuguete {
    private static Scanner teclado = new Scanner(System.in);
    private int id;
    private String color, materialExterior, relleno;

    public Juguete crear() {

        id = Menu.getInstance().juguetes.size();

        System.out.println("Ingrese el color del peluche");
        color = teclado.nextLine();

        System.out.println("Ingrese el material exterior del peluche");
        materialExterior = teclado.nextLine();

        System.out.println("Ingrese el relleno del peluche");
        relleno = teclado.nextLine();

        Peluche teddy = Peluche.builder()
                .id(id)
                .color(color)
                .materialExterior(materialExterior)
                .relleno(relleno)
                .build();

        Menu.getInstance().juguetes.add(teddy);
        return new Peluche(id, color, materialExterior, relleno);
    }
}
