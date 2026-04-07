package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    private PokedexView view;
    private boolean salir = false;
    private int opcion;

    public PokedexController(PokedexView view) {
        this.view = view;
    }

    public void init() {
        while (!salir) {
            view.mostrarMenu();
            opcion = view.leerEntero();

            switch (opcion) {
                case PokedexView.OPC_MENU_SALIDA -> salir = true;
            }
        }

    }
}
