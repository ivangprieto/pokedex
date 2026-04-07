package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    public static final int OPC_MENU_SALIDA = -1;
    public static final String MSG_OP_SALIDA = "-1 SALIR";
    private Scanner sc = new Scanner(System.in);
    private String entrada;

    public void mostrarMenu() {
        System.out.println(MSG_OP_SALIDA);

    }

    public String leerString() {
        System.out.print("Escribe aqui: ");
        entrada = sc.nextLine();
        return entrada;
    }

    public int leerEntero() {
        int numero;
        System.out.print("Escibe aqui: ");
        numero = sc.nextInt();
        return numero;
    }
}
