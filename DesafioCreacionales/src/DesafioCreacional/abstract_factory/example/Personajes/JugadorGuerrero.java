//Clase concreta Guerrero
package DesafioCreacional.abstract_factory.example.Personajes;
public class JugadorGuerrero implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El guerrero esta atacando");
    }

    @Override
    public void recibirDanio(int danio) {
        System.out.println("El guerrero ha recibido " + danio + " de daño");
    }
}

