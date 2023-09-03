//Fabrica concreta Mago
package DesafioCreacional.abstract_factory.example.Factory;

import DesafioCreacional.abstract_factory.example.Personajes.JugadorMago;
import DesafioCreacional.abstract_factory.example.Personajes.Personaje;

public class FabricaMago extends FabricaPersonajes {

    @Override
    public Personaje crearPersonaje() {
        return new JugadorMago();
    }
}
