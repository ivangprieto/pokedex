package es.etg.prog.pokedex.model.persistance;

import java.util.List;

import es.etg.prog.pokedex.model.entities.Pokemon;

public interface IPokemoRepository {
    public List<Pokemon> cargar();

    public void guardar(List<Pokemon> lista);
}
