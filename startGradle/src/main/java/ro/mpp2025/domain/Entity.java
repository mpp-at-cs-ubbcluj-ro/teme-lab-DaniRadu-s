package ro.mpp2025.domain;

public interface Entity<Tid> {
    Tid getID();
    void setID(Tid id);
}
