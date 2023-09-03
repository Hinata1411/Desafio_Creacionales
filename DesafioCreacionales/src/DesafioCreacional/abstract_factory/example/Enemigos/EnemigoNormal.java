//Clase concreta EnemigoNormal
package DesafioCreacional.abstract_factory.example.Enemigos;
public class EnemigoNormal implements Enemigo{
    private int Vida;
    private int danio;

    public EnemigoNormal(){
        this.Vida = 100;
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
            System.out.println("El Enemigo Normal ha muerto");
        } else {
            System.out.println("El Enemigo Normal ha recibido " + danio + " de daño. Le queda de vida " + Vida);
        }
    }


}
