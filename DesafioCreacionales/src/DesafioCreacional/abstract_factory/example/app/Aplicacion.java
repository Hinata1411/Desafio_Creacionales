package DesafioCreacional.abstract_factory.example.app;

import DesafioCreacional.abstract_factory.example.Factory.Factory;
import DesafioCreacional.abstract_factory.example.Personajes.Jugador;
import DesafioCreacional.abstract_factory.example.Enemigos.Enemigo;

public class Aplicacion {
    private Jugador jugador1;
    private Enemigo enemigo1;

    public Aplicacion(Factory factory){
        jugador1  = (Jugador) factory.crearPersonaje();
        enemigo1 = (Enemigo) factory.crearEnemigo();

    }
}
