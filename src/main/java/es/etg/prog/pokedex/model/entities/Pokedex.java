package es.etg.prog.pokedex.model.entities;

import java.util.List;

import es.etg.prog.pokedex.model.PokedexManager;
import es.etg.prog.pokedex.model.persistance.IPokemoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pokedex implements PokedexManager {
    private IPokemoRepository repository;

    @Override
    public void cargar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cargar'");
    }

    @Override
    public void guardar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public List<Pokemon> listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Pokemon obtener(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public void capturar(int pokemon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capturar'");
    }

}
