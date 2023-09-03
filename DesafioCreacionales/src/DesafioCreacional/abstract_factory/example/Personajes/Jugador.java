//Clase concreta Jugador
package DesafioCreacional.abstract_factory.example.Personajes;
public class Jugador implements Personaje {
    private int Vida;
    private int danio;

    public Jugador(){
        this.Vida = 100;
        this.danio = 0;
    }

    @Override
    public void atacar() {
        System.out.println("El Personaje ha atacado");
    }

    @Override
    public void recibirDanio(int danio) {
        Vida -= danio;

        if (Vida <= 0){
            Vida = 0;
            System.out.println("El personaje ha muerto");
        } else {
            System.out.println("El personaje ha recibido " + danio + "de daño");
        }
    }
    @Override
    public int getVida() {
        return Vida;
    }
}

