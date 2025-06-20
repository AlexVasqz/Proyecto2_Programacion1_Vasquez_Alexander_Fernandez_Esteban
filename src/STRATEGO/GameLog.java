/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRATEGO;

/**
 *
 * @author esteb
 */

public class GameLog {
    private String jugador1;
    private String jugador2;
    private String ganador;
    private String rolJugador1;
    private String rolJugador2;
    
    public GameLog(String jugador1, String jugador2, String ganador, 
                   String rolJugador1, String rolJugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.ganador = ganador;
        this.rolJugador1 = rolJugador1;
        this.rolJugador2 = rolJugador2;
    }

    public String getJugador1() { return jugador1; }
    public String getJugador2() { return jugador2; }
    public String getGanador() { return ganador; }
    public String getRolJugador1() { return rolJugador1; }
    public String getRolJugador2() { return rolJugador2; }
    
    public String getRolDelJugador(String nombreJugador) {
        if (jugador1.equals(nombreJugador)) {
            return rolJugador1;
        } else if (jugador2.equals(nombreJugador)) {
            return rolJugador2;
        }
        return "";
    }
    
    public String getOponente(String nombreJugador) {
        if (jugador1.equals(nombreJugador)) {
            return jugador2;
        } else if (jugador2.equals(nombreJugador)) {
            return jugador1;
        }
        return "";
    }
    
    public boolean ganoElJugador(String nombreJugador) {
        return ganador.equals(nombreJugador);
    }
    
    public String formatearLog(String jugadorActual) {
        String oponente = getOponente(jugadorActual);
        String rolActual = getRolDelJugador(jugadorActual);
        String rolOponente = getRolDelJugador(oponente);
        String resultado = ganoElJugador(jugadorActual) ? "GANÓ" : "PERDIÓ";
        
        return "vs " + oponente + " | " + jugadorActual + ": " + rolActual + 
               " - " + oponente + ": " + rolOponente + " | " + resultado;
    }
    
    @Override
    public String toString() {
        return jugador1 + ": " + rolJugador1 + " vs " + jugador2 + ": " + rolJugador2 + 
               " - Ganador: " + ganador;
    }
}
