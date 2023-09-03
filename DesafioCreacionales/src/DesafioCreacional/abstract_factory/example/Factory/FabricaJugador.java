package DesafioCreacional.abstract_factory.example.Factory;

import DesafioCreacional.abstract_factory.example.Personajes.Personaje;
import DesafioCreacional.abstract_factory.example.Personajes.Jugador;
public class FabricaJugador extends FabricaPersonajes {

    @Override
    public Personaje crearPersonaje() {
        return new Jugador();
    }
}
