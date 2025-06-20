package STRATEGO;

public class Player {

    private String username;
    private String password;
    private int puntos;
    private int ganadas;
    private int perdidas;
    private int vecesHeroe;
    private int vecesVillano;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        this.ganadas = 0;
        this.perdidas = 0;
        this.vecesHeroe = 0;
        this.vecesVillano = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public int getVecesHeroe() {
        return vecesHeroe;
    }

    public int getVecesVillano() {
        return vecesVillano;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void incrementarGanadas() {
        this.ganadas++;
    }

    public void incrementarPerdidas() {
        this.perdidas++;
    }

    public void incrementarVecesHeroe() {
        this.vecesHeroe++;
    }

    public void incrementarVecesVillano() {
        this.vecesVillano++;
    }

    public int getTotalPartidas() {
        return ganadas + perdidas;
    }

    @Override
    public String toString() {
         return "Player{" +
                "username='" + username + '\'' +
                ", puntos=" + puntos +
                ", ganadas=" + ganadas +
                ", perdidas=" + perdidas +
                ", vecesHeroe=" + vecesHeroe +
                ", vecesVillano=" + vecesVillano +
                '}';
    }
}
