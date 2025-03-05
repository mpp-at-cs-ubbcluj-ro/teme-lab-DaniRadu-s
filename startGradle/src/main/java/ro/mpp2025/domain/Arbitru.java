package ro.mpp2025.domain;

import java.io.Serializable;

public class Arbitru implements Entity<Integer>, Serializable {
    private int ID;
    private String Username;
    private String Password;
    private String Nume;

    public Arbitru() {
        this.ID = 0;
        this.Username = "";
        this.Password = "";
        this.Nume = "";
    }
    public Arbitru(int ID, String Username, String Password, String Nume) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Nume = Nume;
    }
    public Integer getID(){
        return ID;
    }
    public void setID(Integer ID){
        this.ID = ID;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getNume() {
        return Nume;
    }
    public void setNume(String nume) {
        Nume = nume;
    }
}
