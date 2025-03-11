package ro.mpp2025.domain;

import java.io.Serializable;
import java.util.Objects;

public class Arbitru extends Entity<Long> {
    private String Username;
    private String Password;
    private String Nume;

    public Arbitru() {
        this.Username = "";
        this.Password = "";
        this.Nume = "";
    }
    public Arbitru(String Username, String Password, String Nume) {
        this.Username = Username;
        this.Password = Password;
        this.Nume = Nume;
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

    @Override
    public String toString() {
        return "Arbitru{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", name=" + getNume() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arbitru)) return false;
        Arbitru that = (Arbitru) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getUsername(), getPassword());
    }
}
