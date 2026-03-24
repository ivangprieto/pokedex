package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {
    public static final int OPC_MENU_SALIDA = -1;
    public static final String MSG_OP_SALIDA = "-1 SALIR";
    private Scanner sc = new Scanner(System.in);
    private int opcionEntrada;
    private String entrada;
    private final String MSG_ENTRADA_MENU = "Introduce una opcion: ";

    public void mostrarMenu() {
        System.out.println(MSG_OP_SALIDA);
        System.out.print(MSG_ENTRADA_MENU);
        opcionEntrada = leerEntero();
        switch (opcionEntrada) {
            case 1:
                break;
            case OPC_MENU_SALIDA:
                break;
        }

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
