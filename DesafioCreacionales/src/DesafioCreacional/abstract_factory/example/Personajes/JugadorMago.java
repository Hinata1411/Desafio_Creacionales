package DesafioCreacional.abstract_factory.example.Personajes;
public class JugadorMago implements Personaje{
    private int Vida;
    private int danio;
    @Override
    public void atacar() {
        System.out.println("El Mago esta atacando");
    }
    public JugadorMago(){
        this.Vida = 100;
        this.danio = 0;
    }

    @Override
    public void recibirDanio(int danio) {
        Vida -= danio;
        if (Vida <= 0){
            Vida = 0;
            System.out.println("El MAGO ha muerto");

        } else {
            System.out.println("El MAGO ha recibido " + danio + " de daño. Puntos de vida restantes " + Vida+ "\n");
        }
    }
    @Override
    public int getVida() {
        return Vida;
    }
}
