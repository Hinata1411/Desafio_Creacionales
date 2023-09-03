package DesafioCreacional.abstract_factory.example.Personajes;
public class JugadorMago implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El Mago esta atacando");
    }

    @Override
    public void recibirDanio(int danio) {
        System.out.println("El Mago ha recibido "+danio+" de daño");
    }
}
