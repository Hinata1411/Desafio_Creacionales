package DesafioCreacional.abstract_factory.example.Factory;
import DesafioCreacional.abstract_factory.example.Enemigos.Enemigo;
import DesafioCreacional.abstract_factory.example.Personajes.Personaje;

public interface Factory {
    Enemigo crearEnemigo();
    Personaje crearPersonaje();
}
