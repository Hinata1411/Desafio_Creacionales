//Clase concreta Guerrero
package DesafioCreacional.abstract_factory.example.Personajes;
public class JugadorGuerrero implements Personaje{
    private int Vida;
    private int danio;
    @Override
    public void atacar() {
        System.out.println("El guerrero esta atacando \n");
    }
    public JugadorGuerrero(){
        this.Vida = 100;
        this.danio = 0;
    }

    @Override
    public void recibirDanio(int danio) {
        Vida -= danio;
        if (Vida <= 0){
            Vida = 0;
            System.out.println("El GUERRERO ha muerto \n");
            System.out.print(" ");
        } else {
            System.out.println("El GUERRERO ha recibido " + danio + " de daño. Puntos de vida restantes " + Vida+ "\n");
        }
    }
    @Override
    public int getVida() {
        return Vida;
    }
}

