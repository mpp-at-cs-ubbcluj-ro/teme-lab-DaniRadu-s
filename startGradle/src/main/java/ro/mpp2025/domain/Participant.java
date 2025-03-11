package ro.mpp2025.domain;

import java.util.Objects;

public class Participant extends Entity<Long>{
    private String name;
    private Long idProba;
    private int nrPuncte;

    public Participant(String name, Long idProba, int nrPuncte) {
        this.name = name;
        this.idProba = idProba;
        this.nrPuncte = nrPuncte;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getIdProba() {
        return idProba;
    }
    public void setIdProba(Long idProba) {
        this.idProba = idProba;
    }
    public int getNrPuncte() {
        return nrPuncte;
    }
    public void setNrPuncte(int nrPuncte) {
        this.nrPuncte = nrPuncte;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "nume='" + name + '\'' +
                ", idProba=" + idProba +
                ", nrPuncte=" + nrPuncte +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant that = (Participant) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIdProba(), getNrPuncte());
    }
}
