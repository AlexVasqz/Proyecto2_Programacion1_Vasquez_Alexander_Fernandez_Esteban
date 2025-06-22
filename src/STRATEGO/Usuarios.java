package STRATEGO;

public class Usuarios {
    private static final int usuariosMax = 100; 
    private static final int longitudContrasena = 5; 
    private static final boolean usuarioUnico = true; 
    private static Player[] usuarios = new Player[usuariosMax];
    private static int contadorUsuarios = 0;
    
  
    public static boolean createPlayer(String username, String password) {
       
        if (usernameExists(username)) {
            return false; 
        }
        
  
        if (password.length() != longitudContrasena) {
            return false; 
        }
        
      
        if (contadorUsuarios >= usuariosMax) {
            return false; 
        }
        
        
        usuarios[contadorUsuarios] = new Player(username, password);
        contadorUsuarios++;
        return true;
    }
    

    public static boolean usernameExists(String username) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static Player validateLogin(String username, String password) {
        for (int i = 0; i < contadorUsuarios; i++) {
            Player player = usuarios[i];
            if (player.getUsername().equals(username)
                    && player.getPassword().equals(password)) {

                if (player.isEliminado()) {
                    return null;
                }

                return player;
            }
        }
        return null;
    }
    
    public static Player[] getActiveUsers() {
        int activeCount = 0;
        
        for (int i = 0; i < contadorUsuarios; i++) {
            if (!usuarios[i].isEliminado()) {
                activeCount++;
            }
        }
        
        Player[] activeUsers = new Player[activeCount];
        int index = 0;
        for (int i = 0; i < contadorUsuarios; i++) {
            if (!usuarios[i].isEliminado()) {
                activeUsers[index] = usuarios[i];
                index++;
            }
        }
        
        return activeUsers;
    }
    
    public static int getActiveUserCount() {
        int count = 0;
        for (int i = 0; i < contadorUsuarios; i++) {
            if (!usuarios[i].isEliminado()) {
                count++;
            }
        }
        return count;
    }
    
    public static int getUserCount() {
        return contadorUsuarios;
    }
    
  
    public static Player[] getAllUsers() {
        Player[] result = new Player[contadorUsuarios];
        for (int i = 0; i < contadorUsuarios; i++) {
            result[i] = usuarios[i];
        }
        return result;
    }
    
 
    public static Player getPlayerByUsername(String username) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getUsername().equals(username)) {
                return usuarios[i];
            }
        }
        return null;
    }
} 