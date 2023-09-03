//Fabrica concreta Enemigo Jefe
package DesafioCreacional.abstract_factory.example.Factory;
import DesafioCreacional.abstract_factory.example.Enemigos.Enemigo;
import DesafioCreacional.abstract_factory.example.Enemigos.EnemigoJefe;

public class FabricaEnemigoJefe extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoJefe() {
        };
    }

}
