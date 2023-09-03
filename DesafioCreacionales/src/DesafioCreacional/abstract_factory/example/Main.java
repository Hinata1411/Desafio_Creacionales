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

        System.out.println("Bienvenido a el juego:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el tipo de jugador 1 para Mago, 2 para Guerrero ");
        int opcionp = scanner.nextInt();

        FabricaPersonajes fabricaJugador;

        if (opcionp == 1) {
            fabricaJugador = new FabricaMago();
        } else if (opcionp == 2) {
            fabricaJugador = new FabricaGuerrero();
        } else {
            System.out.println("Opción no válida. Se creará un jugador por defecto.");
            fabricaJugador = new FabricaMago(); // Opción por defecto Mago
        }
        Personaje jugador = fabricaJugador.crearPersonaje();


        scanner = new Scanner(System.in);

        System.out.println("Elige el tipo de enemigo 1 para Normal, 2 para Jefe ");
        int opcione = scanner.nextInt();

        FabricaEnemigos fabricaEnemigos;

        if (opcione == 1) {
            fabricaEnemigos = new FabricaEnemigoNormal();
        } else if (opcione == 2) {
            fabricaEnemigos = new FabricaEnemigoJefe();
        } else {
            System.out.println("Opción no válida. Se creará un Enemigo por defecto.");
            fabricaEnemigos = new FabricaEnemigoNormal(); // Opción por defecto Normal
        }
        Enemigo enemigo1 = fabricaEnemigos.crearEnemigo();

        jugador.atacar();
        enemigo1.recibirDanio(20);

        enemigo1.atacar();
        jugador.recibirDanio(10);

        jugador.atacar();
        enemigo1.recibirDanio(50);

        System.out.println("Fin del juego :) ");

    }

}
