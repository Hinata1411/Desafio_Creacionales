package DesafioCreacional.abstract_factory.example;
import DesafioCreacional.abstract_factory.example.app.Aplicacion;
import DesafioCreacional.abstract_factory.example.Personajes.Personaje;
import DesafioCreacional.abstract_factory.example.Enemigos.Enemigo;
import DesafioCreacional.abstract_factory.example.Factory.Factory;
import DesafioCreacional.abstract_factory.example.Factory.FabricaEnemigos;
import DesafioCreacional.abstract_factory.example.Factory.FabricaEnemigoNormal;
import DesafioCreacional.abstract_factory.example.Factory.FabricaEnemigoJefe;
import DesafioCreacional.abstract_factory.example.Factory.FabricaPersonajes;
import DesafioCreacional.abstract_factory.example.Factory.FabricaGuerrero;
import DesafioCreacional.abstract_factory.example.Factory.FabricaMago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aplicacion app;
        Factory factory;

        System.out.println("---------BIENVENIDO AL JUEGO---------");
        //Personajes GUERRERO O MAGO
        Scanner scanner = new Scanner(System.in);

        System.out.println("REGLAS ");
        System.out.println("El jugador empezará con el 100% de vida y los enemigos atacarán haciendo 20% de daño.");
        System.out.println("---------Empieza el juego---------");
        System.out.println("Elige el tipo de jugador: \n 1. MAGO \n 2. GUERRERO ");
        int opcionp = scanner.nextInt();

        FabricaPersonajes fabricaJugador;

        if (opcionp == 1) {
            fabricaJugador = new FabricaMago();
            System.out.println("Haz elegido MAGO");
        } else if (opcionp == 2) {
            fabricaJugador = new FabricaGuerrero();
            System.out.println("Haz elegido GUERRERO");
        } else {
            System.out.println("Opción no válida. Se creará un jugador por defecto.");
            fabricaJugador = new FabricaMago(); // Opción por defecto Mago
        }
        Personaje jugador = fabricaJugador.crearPersonaje();

        //Enemigo NORMAL O JEFE
        scanner = new Scanner(System.in);

        System.out.println("Elige el tipo de enemigo: \n  1. NORMAL (Vida 50%) \n  2. JEFE (Vida 100%) ");
        int opcione = scanner.nextInt();

        FabricaEnemigos fabricaEnemigos;

        if (opcione == 1) {
            fabricaEnemigos = new FabricaEnemigoNormal();
            System.out.println("Haz elegido ENEMIGO NORMAL \n");
        } else if (opcione == 2) {
            fabricaEnemigos = new FabricaEnemigoJefe();
            System.out.println("Haz elegido JEFE \n");
        } else {
            System.out.println("Opción no válida. Se creará un Enemigo por defecto.");
            fabricaEnemigos = new FabricaEnemigoNormal(); // Opción por defecto Normal
        }
        Enemigo enemigo1 = fabricaEnemigos.crearEnemigo();

        System.out.println("---------Empieza el juego--------- \n");

        while (jugador.getVida() > 0 && enemigo1.getVida() > 0) {

            System.out.println("Ingresa la cantidad de daño hecho al enemigo (0-10)");
            int danio = scanner.nextInt();
            System.out.println("\n COMBATE");
            jugador.atacar();
            enemigo1.recibirDanio(danio);


            if (enemigo1.getVida() <= 0) {
                System.out.println("¡GANASTE! :)\n Derrotaste al enemigo. \n");
                break;
            }
            System.out.println("\n ATAQUE ENEMIGO");
            enemigo1.atacar();
            jugador.recibirDanio(20);

            if (jugador.getVida() <= 0) {
                System.out.println("¡GAME OVER! :( \n El Personaje ha sido derrotado. \n");
                break;
            }

        }

        System.out.println("Fin del juego");
    }

}
