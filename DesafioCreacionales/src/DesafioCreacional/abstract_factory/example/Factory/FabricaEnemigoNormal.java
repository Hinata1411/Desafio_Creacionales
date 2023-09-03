//Fabrica concreta Enemigo Normal
package DesafioCreacional.abstract_factory.example.Factory;
import DesafioCreacional.abstract_factory.example.Enemigos.Enemigo;
import DesafioCreacional.abstract_factory.example.Enemigos.EnemigoNormal;
public class FabricaEnemigoNormal extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoNormal() {
        };
    }

}
