package ro.mpp2025.domain;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}

