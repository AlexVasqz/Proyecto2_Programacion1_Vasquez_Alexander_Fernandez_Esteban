package STRATEGO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class Tablero extends JFrame {

    private JButton[][] casillas;
    private String[] imagenesHeroes;
    private String[] imagenesVillanos;
    private Random random;
    private boolean[][] casillasOcupadas;
    private JButton fichaSeleccionada;
    private int filaSeleccionada = -1;
    private int colSeleccionada = -1;
    private String[][] fichasEnTablero;
    private boolean turnoHeroes;
    private JLabel labelTurno;

    public Tablero() {
        super("Tablero de Stratego");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setResizable(false);

        random = new Random();
        casillasOcupadas = new boolean[10][10];
        fichaSeleccionada = null;
        fichasEnTablero = new String[10][10];
        turnoHeroes = true;

        labelTurno = new JLabel("TURNO: HÉROES", SwingConstants.CENTER);
        labelTurno.setFont(new Font("Arial", Font.BOLD, 20));
        labelTurno.setForeground(Color.GREEN);
        labelTurno.setOpaque(true);
        labelTurno.setBackground(Color.WHITE);

        imagenesHeroes = new String[]{
            "heroe 1 (10).png", "heroe 2 (9).png", "heroe 3 (8).png", "heroe 4 (8).png",
            "heroe 5 (7).png", "heroe 6 (6).png", "heroe 7 (7).png", " heroe 8 (6).png",
            "heroe 9 (6).png", "heroe 10  (6).png", "heroe 11 (6).png", "heroe 12 (5).png",
            "heroe 13 (5).png", "heroe 14 (5).png", "heroe 15 (5).png", "heroe 16 (4).png",
            "heroe 17 (4).png", "heroe 18 (4).png", "heroe 19 (4).png", "heroe 20 (3).png",
            "heroe 21 (3).png", "heroe 22 (3).png", "heroe 23 (3).png", "heroe 24 (3).png",
            "heroe 25 (2).png", "heroe 26 (2).png", "heroe 27 (2).png", "heroe 28 (2).png",
            "heroe 29 (2).png", "heroe 30 (2).png", "heroe 31 (2).png", "heroe 32 (2).png",
            "heroe 33 (1).png"
        };

        imagenesVillanos = new String[]{
            "villian 1 (10).png", "villian 2 (9).png", "villian 3 (8).png", "villian 4 (8).png",
            "villian 5 (7).png", "villian 6 (7).png", "villian 7 (7).png", "villian 8 (6).png",
            "villian 9 (6).png", "villian 10 (6).png", "villian 11 (6).png", "villian 12 (5).png",
            "villian 13 (5).png", "villian 14 (5).png", "villian 15 (5).png", "villian 16 (4).png",
            "villian 17 (4).png", "villian 18 (4).png", "villian 19 (4).png", "villian 20 (3).png",
            "villian 21 (3).png", "villian 22 (3).png", "villian 23 (3).png", "villian 24 (3).png",
            "villian 25 (2).png", "villian 26 (2).png", "villian 27 (2).png", "villian 28 (2).png",
            "villian 29 (2).png", "villian 30 (2).png", "villian 31 (2).png", "villian 32 (2).png",
            "villian 33 (1).png"
        };

        JPanel panelTablero = new JPanel(new GridLayout(10, 10, 2, 2));
        panelTablero.setBackground(Color.BLACK);
        casillas = new JButton[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                casillas[i][j] = new JButton();
                casillas[i][j].setPreferredSize(new Dimension(70, 70));

                if ((i == 4 || i == 5) && (j == 2 || j == 3 || j == 6 || j == 7)) {
                    casillas[i][j].setBackground(Color.BLUE);
                    casillas[i][j].setText("LAGO");
                    casillas[i][j].setEnabled(false);
                    casillasOcupadas[i][j] = true;
                } else {
                    casillas[i][j].setBackground(Color.WHITE);
                }

                final int fila = i;
                final int col = j;
                casillas[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        manejarClickCasilla(fila, col);
                    }
                });

                panelTablero.add(casillas[i][j]);
            }
        }

        colocarFichasEquipo(true);

        colocarFichasEquipo(false);

        add(labelTurno, BorderLayout.NORTH);
        add(panelTablero, BorderLayout.CENTER);
    }

    private void manejarClickCasilla(int fila, int col) {
        if (fichaSeleccionada == null && casillas[fila][col].getIcon() != null
                && !casillas[fila][col].getText().equals("LAGO")) {

            if (!esFichaDelJugadorEnTurno(fila, col)) {
                return;
            }

            if (!puedeMoverseFicha(fila, col)) {
                return;
            }

            fichaSeleccionada = casillas[fila][col];
            filaSeleccionada = fila;
            colSeleccionada = col;

            casillas[fila][col].setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));

        } else if (fichaSeleccionada != null) {

            if (fila == filaSeleccionada && col == colSeleccionada) {
                deseleccionarFicha();
            } else if (puedeMoverse(filaSeleccionada, colSeleccionada, fila, col)) {
                moverFicha(filaSeleccionada, colSeleccionada, fila, col);
                deseleccionarFicha();
                cambiarTurno();
            } else {
                if (casillas[fila][col].getIcon() != null && !casillas[fila][col].getText().equals("LAGO")) {
                    if (esFichaDelJugadorEnTurno(fila, col) && puedeMoverseFicha(fila, col)) {
                        deseleccionarFicha();
                        fichaSeleccionada = casillas[fila][col];
                        filaSeleccionada = fila;
                        colSeleccionada = col;
                        casillas[fila][col].setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
                    }
                }
            }
        }
    }

    private boolean puedeMoverse(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        if (casillas[filaDestino][colDestino].getText().equals("LAGO")) {
            return false;
        }

        boolean destinoVacio = casillas[filaDestino][colDestino].getIcon() == null;
        boolean fichaEnemiga = false;

        if (!destinoVacio) {
            fichaEnemiga = !esFichaDelJugadorEnTurno(filaDestino, colDestino);
        }

        if (!destinoVacio && !fichaEnemiga) {
            return false;
        }

        if (fichaEnemiga && !puedeAtacar(filaOrigen, colOrigen)) {
            return false;
        }

        int rango = obtenerRangoFicha(filaOrigen, colOrigen);

        if (rango == 2) {
            return puedeMoverseTorre(filaOrigen, colOrigen, filaDestino, colDestino);
        } else {
            return esMovimientoAdyacente(filaOrigen, colOrigen, filaDestino, colDestino);
        }
    }

    private boolean puedeAtacar(int fila, int col) {
        if (fichasEnTablero[fila][col] == null) {
            return false;
        }

        String nombreFicha = fichasEnTablero[fila][col];

        if (nombreFicha.equals("nova blast.png")) {
            return false;
        }
        if (nombreFicha.equals("pumpkin bomb.png")) {
            return false;
        }
        if (nombreFicha.equals("earth.png")) {
            return false;
        }

        return true;
    }

    private int obtenerRangoFicha(int fila, int col) {
        if (casillas[fila][col].getIcon() == null) {
            return -1;
        }

        if (fichasEnTablero[fila][col] == null) {
            return 1;
        }

        String nombreFicha = fichasEnTablero[fila][col];

        int inicioParentesis = nombreFicha.indexOf('(');
        if (inicioParentesis == -1) {
            return 1;
        }

        int finParentesis = nombreFicha.indexOf(')');
        if (finParentesis == -1) {
            return 1;
        }

        String rangoStr = nombreFicha.substring(inicioParentesis + 1, finParentesis);

        if (rangoStr.equals("1")) {
            return 1;
        }
        if (rangoStr.equals("2")) {
            return 2;
        }
        if (rangoStr.equals("3")) {
            return 3;
        }
        if (rangoStr.equals("4")) {
            return 4;
        }
        if (rangoStr.equals("5")) {
            return 5;
        }
        if (rangoStr.equals("6")) {
            return 6;
        }
        if (rangoStr.equals("7")) {
            return 7;
        }
        if (rangoStr.equals("8")) {
            return 8;
        }
        if (rangoStr.equals("9")) {
            return 9;
        }
        if (rangoStr.equals("10")) {
            return 10;
        }

        return 1;
    }

    private boolean esMovimientoAdyacente(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = colDestino - colOrigen;

        int deltaFilaAbs = deltaFila;
        if (deltaFila < 0) {
            deltaFilaAbs = -deltaFila;
        }

        int deltaColAbs = deltaCol;
        if (deltaCol < 0) {
            deltaColAbs = -deltaCol;
        }

        if (deltaFilaAbs == 1 && deltaColAbs == 0) {
            return true;
        }
        if (deltaFilaAbs == 0 && deltaColAbs == 1) {
            return true;
        }

        return false;
    }

    private boolean puedeMoverseTorre(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = colDestino - colOrigen;

        if (deltaFila != 0 && deltaCol != 0) {
            return false;
        }

        return caminoLibre(filaOrigen, colOrigen, filaDestino, colDestino);
    }

    private boolean caminoLibre(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = colDestino - colOrigen;

        int pasoFila = 0;
        int pasoCol = 0;

        if (deltaFila != 0) {
            if (deltaFila > 0) {
                pasoFila = 1;
            } else {
                pasoFila = -1;
            }
        }
        if (deltaCol != 0) {
            if (deltaCol > 0) {
                pasoCol = 1;
            } else {
                pasoCol = -1;
            }
        }

        int filaActual = filaOrigen + pasoFila;
        int colActual = colOrigen + pasoCol;

        while (filaActual != filaDestino || colActual != colDestino) {
            if (filaActual < 0 || filaActual >= 10 || colActual < 0 || colActual >= 10) {
                return false;
            }

            if (casillas[filaActual][colActual].getIcon() != null
                    || casillas[filaActual][colActual].getText().equals("LAGO")) {
                return false;
            }

            filaActual += pasoFila;
            colActual += pasoCol;
        }

        return true;
    }

    private void moverFicha(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
        boolean hayCombate = casillas[filaDestino][colDestino].getIcon() != null;

        if (hayCombate) {
            realizarCombate(filaOrigen, colOrigen, filaDestino, colDestino);
        } else {
            Icon icono = casillas[filaOrigen][colOrigen].getIcon();
            casillas[filaDestino][colDestino].setIcon(icono);
            casillas[filaOrigen][colOrigen].setIcon(null);

            fichasEnTablero[filaDestino][colDestino] = fichasEnTablero[filaOrigen][colOrigen];
            fichasEnTablero[filaOrigen][colOrigen] = null;

            casillasOcupadas[filaDestino][colDestino] = true;
            casillasOcupadas[filaOrigen][colOrigen] = false;
        }
    }

    private void realizarCombate(int filaAtacante, int colAtacante, int filaDefensor, int colDefensor) {
        int rangoAtacante = obtenerRangoFicha(filaAtacante, colAtacante);
        int rangoDefensor = obtenerRangoFicha(filaDefensor, colDefensor);

        String nombreDefensor = fichasEnTablero[filaDefensor][colDefensor];

        System.out.println("COMBATE: Rango " + rangoAtacante + " vs " + nombreDefensor);

        boolean atacanteGana = false;
        boolean defensorGana = false;
        boolean empate = false;

        boolean defensorEsBomba = false;
        if (nombreDefensor.equals("nova blast.png") || nombreDefensor.equals("pumpkin bomb.png")) {
            defensorEsBomba = true;
        }

        if (defensorEsBomba) {
            if (rangoAtacante == 3) {
                atacanteGana = true;
                System.out.println("Rango 3 desactiva la bomba");
            } else {
                defensorGana = true;
                System.out.println("La bomba mata al atacante");
            }
        } else {
            if (rangoAtacante == 1) {
                if (rangoDefensor == 10) {
                    atacanteGana = true;
                } else {
                    defensorGana = true;
                }
            } else if (rangoDefensor == 1) {
                atacanteGana = true;
            } else if (rangoAtacante == rangoDefensor) {
                empate = true;
            } else if (rangoAtacante > rangoDefensor) {
                atacanteGana = true;
            } else {
                defensorGana = true;
            }
        }

        if (atacanteGana) {
            Icon icono = casillas[filaAtacante][colAtacante].getIcon();
            casillas[filaDefensor][colDefensor].setIcon(icono);
            casillas[filaAtacante][colAtacante].setIcon(null);

            fichasEnTablero[filaDefensor][colDefensor] = fichasEnTablero[filaAtacante][colAtacante];
            fichasEnTablero[filaAtacante][colAtacante] = null;

            casillasOcupadas[filaDefensor][colDefensor] = true;
            casillasOcupadas[filaAtacante][colAtacante] = false;

            if (defensorEsBomba) {
                System.out.println("Atacante GANA - Rango " + rangoAtacante + " desactiva la bomba");
            } else {
                System.out.println("Atacante GANA - Rango " + rangoAtacante + " vence a Rango " + rangoDefensor);
            }

        } else if (defensorGana) {
            casillas[filaAtacante][colAtacante].setIcon(null);
            fichasEnTablero[filaAtacante][colAtacante] = null;
            casillasOcupadas[filaAtacante][colAtacante] = false;

            if (defensorEsBomba) {
                System.out.println("Defensor GANA - La bomba mata a Rango " + rangoAtacante);
            } else {
                System.out.println("Defensor GANA - Rango " + rangoDefensor + " vence a Rango " + rangoAtacante);
            }

        } else if (empate) {
            casillas[filaAtacante][colAtacante].setIcon(null);
            casillas[filaDefensor][colDefensor].setIcon(null);

            fichasEnTablero[filaAtacante][colAtacante] = null;
            fichasEnTablero[filaDefensor][colDefensor] = null;

            casillasOcupadas[filaAtacante][colAtacante] = false;
            casillasOcupadas[filaDefensor][colDefensor] = false;

            System.out.println("EMPATE - Ambas fichas Rango " + rangoAtacante + " eliminadas");
        }
    }

    private void deseleccionarFicha() {
        if (fichaSeleccionada != null) {
            fichaSeleccionada.setBorder(null);
            fichaSeleccionada = null;
            filaSeleccionada = -1;
            colSeleccionada = -1;
        }
    }

    private void colocarFichasEquipo(boolean esVillano) {
        int filaInicio;
        if (esVillano) {
            filaInicio = 0;
        } else {
            filaInicio = 6;
        }

        String rutaBomba;
        if (esVillano) {
            rutaBomba = "/imagenes/villians/pumpkin bomb.png";
        } else {
            rutaBomba = "/imagenes/heroes/nova blast.png";
        }

        String rutaEarth = "/imagenes/heroes/earth.png";

        int filaEarth;
        if (esVillano) {
            filaEarth = 0;
        } else {
            filaEarth = 9;
        }
        int colEarth = 1 + random.nextInt(8);
        colocarImagen(casillas[filaEarth][colEarth], rutaEarth);
        casillasOcupadas[filaEarth][colEarth] = true;

        int[][] posicionesBombas = new int[3][2];
        int numBombas = 0;

        if (filaEarth > 0 && !esVillano) {
            posicionesBombas[numBombas][0] = filaEarth - 1;
            posicionesBombas[numBombas][1] = colEarth;
            numBombas++;
        } else if (filaEarth < 9 && esVillano) {
            posicionesBombas[numBombas][0] = filaEarth + 1;
            posicionesBombas[numBombas][1] = colEarth;
            numBombas++;
        }

        if (colEarth > 0) {
            posicionesBombas[numBombas][0] = filaEarth;
            posicionesBombas[numBombas][1] = colEarth - 1;
            numBombas++;
        }

        if (colEarth < 9) {
            posicionesBombas[numBombas][0] = filaEarth;
            posicionesBombas[numBombas][1] = colEarth + 1;
            numBombas++;
        }

        for (int i = 0; i < numBombas; i++) {
            int fila = posicionesBombas[i][0];
            int col = posicionesBombas[i][1];
            colocarImagen(casillas[fila][col], rutaBomba);
            casillasOcupadas[fila][col] = true;
        }

        int bombasRestantes = 6 - numBombas;
        int[] filasUltimas;
        if (esVillano) {
            filasUltimas = new int[]{0, 1};
        } else {
            filasUltimas = new int[]{8, 9};
        }

        while (bombasRestantes > 0) {
            int filaIndex = random.nextInt(2);
            int fila = filasUltimas[filaIndex];
            int col = random.nextInt(10);
            if (!casillasOcupadas[fila][col] && !esLago(fila, col)) {
                colocarImagen(casillas[fila][col], rutaBomba);
                casillasOcupadas[fila][col] = true;
                bombasRestantes--;
            }
        }

        String[] imagenes;
        if (esVillano) {
            imagenes = imagenesVillanos;
        } else {
            imagenes = imagenesHeroes;
        }
        String[] fichasRango2 = new String[11];
        int contadorRango2 = 0;

        for (int i = 0; i < imagenes.length; i++) {
            if (imagenes[i].contains("(2).png")) {
                fichasRango2[contadorRango2] = imagenes[i];
                contadorRango2++;
            }
        }

        System.out.println("Fichas de rango 2 encontradas: " + contadorRango2);

        int[] filasPrimeras;
        if (esVillano) {
            filasPrimeras = new int[]{2, 3};
        } else {
            filasPrimeras = new int[]{6, 7};
        }
        int fichasRango2Colocadas = 0;

        while (fichasRango2Colocadas < contadorRango2) {
            int filaIndex = random.nextInt(2);
            int fila = filasPrimeras[filaIndex];
            int col = random.nextInt(10);
            if (!casillasOcupadas[fila][col] && !esLago(fila, col)) {
                String carpeta;
                if (esVillano) {
                    carpeta = "villians/";
                } else {
                    carpeta = "heroes/";
                }
                String rutaImagen = "/imagenes/" + carpeta + fichasRango2[fichasRango2Colocadas];
                colocarImagen(casillas[fila][col], rutaImagen);
                casillasOcupadas[fila][col] = true;
                fichasRango2Colocadas++;
            }
        }

        int fichasRestantesTotal = imagenes.length - contadorRango2;
        String[] fichasRestantes = new String[fichasRestantesTotal];
        int contadorRestantes = 0;

        for (int i = 0; i < imagenes.length; i++) {
            if (!imagenes[i].contains("(2).png")) {
                fichasRestantes[contadorRestantes] = imagenes[i];
                contadorRestantes++;
            }
        }

        System.out.println("Fichas restantes: " + contadorRestantes + " de " + fichasRestantesTotal);

        for (int i = contadorRestantes - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = fichasRestantes[i];
            fichasRestantes[i] = fichasRestantes[j];
            fichasRestantes[j] = temp;
        }

        int fichasRestantesColocadas = 0;

        for (int i = filaInicio; i < filaInicio + 4 && fichasRestantesColocadas < contadorRestantes; i++) {
            for (int j = 0; j < 10 && fichasRestantesColocadas < contadorRestantes; j++) {
                if (!casillasOcupadas[i][j] && !esLago(i, j)) {
                    if (fichasRestantesColocadas < contadorRestantes) {
                        String carpeta2;
                        if (esVillano) {
                            carpeta2 = "villians/";
                        } else {
                            carpeta2 = "heroes/";
                        }
                        String rutaImagen = "/imagenes/" + carpeta2 + fichasRestantes[fichasRestantesColocadas];
                        colocarImagen(casillas[i][j], rutaImagen);
                        casillasOcupadas[i][j] = true;
                        fichasRestantesColocadas++;
                    }
                }
            }
        }
    }

    private boolean esLago(int fila, int col) {
        return (fila == 4 || fila == 5) && (col == 2 || col == 3 || col == 6 || col == 7);
    }

    private void colocarImagen(JButton casilla, String rutaImagen) {
        int fila = -1;
        int col = -1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (casillas[i][j] == casilla) {
                    fila = i;
                    col = j;
                    break;
                }
            }
            if (fila != -1) {
                break;
            }
        }

        String nombreArchivo = rutaImagen;
        if (rutaImagen.contains("/")) {
            nombreArchivo = rutaImagen.substring(rutaImagen.lastIndexOf("/") + 1);
        }

        if (fila != -1 && col != -1) {
            fichasEnTablero[fila][col] = nombreArchivo;
        }

        if (rutaImagen.equals("/imagenes/heroes/earth.png")
                || rutaImagen.equals("/imagenes/heroes/nova blast.png")
                || rutaImagen.equals("/imagenes/villians/pumpkin bomb.png")) {
            ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
            if (icono.getImageLoadStatus() == MediaTracker.COMPLETE) {
                Image imagen = icono.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                casilla.setIcon(new ImageIcon(imagen));
            } else {
                casilla.setText("?");
            }
        } else {
            ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
            if (icono.getImageLoadStatus() == MediaTracker.COMPLETE) {
                Image imagen = icono.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                casilla.setIcon(new ImageIcon(imagen));
            } else {
                casilla.setText("?");
            }
        }
    }

    private boolean esFichaDelJugadorEnTurno(int fila, int col) {
        if (fichasEnTablero[fila][col] == null) {
            return false;
        }

        String nombreFicha = fichasEnTablero[fila][col];

        boolean esHéroe = false;
        boolean esVillano = false;

        if (nombreFicha.startsWith("heroe")) {
            esHéroe = true;
        }
        if (nombreFicha.startsWith("villian")) {
            esVillano = true;
        }
        if (nombreFicha.equals("nova blast.png")) {
            esHéroe = true;
        }
        if (nombreFicha.equals("pumpkin bomb.png")) {
            esVillano = true;
        }
        if (nombreFicha.equals("earth.png")) {
            if (fila >= 6) {
                esHéroe = true;
            } else {
                esVillano = true;
            }
        }

        if (turnoHeroes && esHéroe) {
            return true;
        }
        if (!turnoHeroes && esVillano) {
            return true;
        }

        return false;
    }

    private void cambiarTurno() {
        turnoHeroes = !turnoHeroes;

        if (turnoHeroes) {
            labelTurno.setText("TURNO: HÉROES");
            labelTurno.setForeground(Color.GREEN);
        } else {
            labelTurno.setText("TURNO: VILLANOS");
            labelTurno.setForeground(Color.RED);
        }
    }

    private boolean puedeMoverseFicha(int fila, int col) {
        if (fichasEnTablero[fila][col] == null) {
            return false;
        }

        String nombreFicha = fichasEnTablero[fila][col];

        if (nombreFicha.equals("nova blast.png")) {
            return false;
        }
        if (nombreFicha.equals("pumpkin bomb.png")) {
            return false;
        }

        if (nombreFicha.equals("earth.png")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tablero tablero = new Tablero();
            tablero.setVisible(true);
        });
    }
}
