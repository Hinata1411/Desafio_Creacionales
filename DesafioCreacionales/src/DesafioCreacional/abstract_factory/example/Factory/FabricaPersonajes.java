//Clase Abstracta FabricaPersonajes
package DesafioCreacional.abstract_factory.example.Factory;

import DesafioCreacional.abstract_factory.example.Personajes.Personaje;

public abstract class FabricaPersonajes {
    public abstract Personaje crearPersonaje();
}
