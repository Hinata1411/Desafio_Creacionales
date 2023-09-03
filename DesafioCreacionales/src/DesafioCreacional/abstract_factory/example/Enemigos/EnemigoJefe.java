package DesafioCreacional.abstract_factory.example.Enemigos;
public class EnemigoJefe implements Enemigo{
    private int Vida;
    private int danio;

    public EnemigoJefe(){
        this.Vida = 100;
        this.danio = 0;
    }

    @Override
    public void atacar() {
        System.out.println("El Jefe ha atacado");
    }

    @Override
    public void recibirDanio(int danio) {
        Vida -= danio;

        if (Vida <= 0){
            Vida = 0;
            System.out.println("El JEFE ha muerto \n");
            System.out.print(" ");
        } else {
            System.out.println("El JEFE ha recibido " + danio + " de daño. Puntos de vida restantes " + Vida+ "\n");
        }
    }

    @Override
    public int getVida() {
        return Vida;
    }
}
