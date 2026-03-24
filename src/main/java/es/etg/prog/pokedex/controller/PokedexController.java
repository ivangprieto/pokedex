package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    private PokedexView view;
    private boolean salir = false;

    private PokedexController(PokedexView view) {
        this.view = view;
    }

    public void init() {
        int opcion;
        while (!salir) {
            view.mostrarMenu();
            opcion = view.leerEntero();

            switch (opcion) {
                case PokedexView.OPC_MENU_SALIDA -> salir = true;
            }
        }

    }
}
