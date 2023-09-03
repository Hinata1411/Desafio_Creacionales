//Clase concreta EnemigoNormal
package DesafioCreacional.abstract_factory.example.Enemigos;
public class EnemigoNormal implements Enemigo{
    private int Vida;
    private int danio;

    public EnemigoNormal(){
        this.Vida = 50;
        this.danio = 0;
    }

    @Override
    public void atacar() {
        System.out.println("El Enemigo Normal ha atacado");
    }


    @Override
    public void recibirDanio(int danio) {
        Vida -= danio;

        if (Vida <= 0){
            Vida = 0;
            System.out.println("El ENEMIGO NORMAL ha muerto");
            System.out.print(" ");
        } else {
            System.out.println("El ENEMIGO NORMAL ha recibido " + danio + " de daño. Puntos de vida restantes " + Vida+ "\n");
        }
    }
    @Override
    public int getVida() {
        return Vida;
    }

}
