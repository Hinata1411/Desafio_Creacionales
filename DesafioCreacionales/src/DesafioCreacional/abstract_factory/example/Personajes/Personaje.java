//Interfaz Personaje
package DesafioCreacional.abstract_factory.example.Personajes;
public interface Personaje {
    void atacar();
    void recibirDanio(int danio);

    int getVida();
}
