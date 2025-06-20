/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRATEGO;

/**
 *
 * @author esteb
 */
public class LogManager {

    private static GameLog[] todosLosLogs = new GameLog[1000];
    private static int totalLogs = 0;

    public static void agregarLog(GameLog log) {
        if (totalLogs < todosLosLogs.length) {
            todosLosLogs[totalLogs] = log;
            totalLogs++;
        }
    }

    public static GameLog[] getLogsDelJugador(String nombreJugador) {

        
        int count = 0;
        for (int i = 0; i < totalLogs; i++) {
            if (todosLosLogs[i].getJugador1().equals(nombreJugador)
                    || todosLosLogs[i].getJugador2().equals(nombreJugador)) {
                count++;
            }
        }

        GameLog[] logsJugador = new GameLog[count];
        int index = 0;
        for (int i = 0; i < totalLogs; i++) {
            if (todosLosLogs[i].getJugador1().equals(nombreJugador)
                    || todosLosLogs[i].getJugador2().equals(nombreJugador)) {
                logsJugador[index] = todosLosLogs[i];
                index++;
            }
        }

        return logsJugador;
    }

    public static GameLog[] getTodosLosLogs() {
        GameLog[] logs = new GameLog[totalLogs];
        for (int i = 0; i < totalLogs; i++) {
            logs[i] = todosLosLogs[i];
        }
        return logs;
    }

    public static void registrarPartido(String jugador1, String jugador2, String ganador,
            String rolJugador1, String rolJugador2) {
        GameLog nuevoLog = new GameLog(jugador1, jugador2, ganador, rolJugador1, rolJugador2);
        agregarLog(nuevoLog);
    }

    public static void limpiarLogs() {
        for (int i = 0; i < totalLogs; i++) {
            todosLosLogs[i] = null;
        }
        totalLogs = 0;
    }

    public static int getTotalLogs() {
        return totalLogs;
    }

    public static GameLog[] getUltimosLogsDelJugador(String nombreJugador, int cantidad) {
        GameLog[] logsJugador = getLogsDelJugador(nombreJugador);

        if (logsJugador.length <= cantidad) {
            return logsJugador;
        } else {
            GameLog[] ultimosLogs = new GameLog[cantidad];
            int startIndex = logsJugador.length - cantidad;
            for (int i = 0; i < cantidad; i++) {
                ultimosLogs[i] = logsJugador[startIndex + i];
            }
            return ultimosLogs;
        }
    }
}
