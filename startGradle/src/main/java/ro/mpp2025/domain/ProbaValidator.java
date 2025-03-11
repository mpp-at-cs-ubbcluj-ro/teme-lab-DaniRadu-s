package ro.mpp2025.domain;

public class ProbaValidator {
    public void validate(Proba proba) {
        StringBuilder errors = new StringBuilder();

        if (proba.getProba() == null || proba.getProba().trim().isEmpty()) {
            errors.append("Proba name cannot be empty.\n");
        }
        if (proba.getIdArbitru() == null) {
            errors.append("idArbitru cannot be null.\n");
        }

        if (errors.length() > 0) {
            throw new ValidationException(errors.toString());
        }
    }
}
