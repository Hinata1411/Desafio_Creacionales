//Fabrica concreta Guerrero
package DesafioCreacional.abstract_factory.example.Factory;

import DesafioCreacional.abstract_factory.example.Personajes.JugadorGuerrero;
import DesafioCreacional.abstract_factory.example.Personajes.Personaje;

public class FabricaGuerrero extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new JugadorGuerrero();
    }

}
