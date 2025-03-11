package ro.mpp2025.domain;

public class ArbitruValidator {
    public void validate(Arbitru arbitru) {
        StringBuilder errors = new StringBuilder();

        if (arbitru.getUsername() == null || arbitru.getUsername().trim().isEmpty()) {
            errors.append("Username cannot be empty.\n");
        }
        if (arbitru.getPassword() == null || arbitru.getPassword().length() < 6) {
            errors.append("Password must be at least 6 characters long.\n");
        }
        if (arbitru.getNume() == null || arbitru.getNume().trim().isEmpty()) {
            errors.append("Name cannot be empty.\n");
        }

        if (errors.length() > 0) {
            throw new ValidationException(errors.toString());
        }
    }
}
