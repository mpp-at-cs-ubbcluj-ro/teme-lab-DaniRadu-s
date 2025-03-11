package ro.mpp2025.domain;

import java.util.Objects;

public class Proba extends Entity<Long>{
    private String proba;
    private Long idArbitru;

    public Proba(String proba, Long idArbitru) {
        this.proba = proba;
        this.idArbitru = idArbitru;
    }
    public String getProba() {
        return proba;
    }
    public void setProba(String proba) {
        this.proba = proba;
    }
    public Long getIdArbitru() {
        return idArbitru;
    }

    public void setIdArbitru(Long idArbitru) {
        this.idArbitru = idArbitru;
    }

    @Override
    public String toString() {
        return "Proba{" +
                "nume='" + proba + '\'' +
                ", idArbitru=" + idArbitru +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proba)) return false;
        Proba that = (Proba) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProba(), getIdArbitru());
    }
}
