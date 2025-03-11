package ro.mpp2025.domain;

public class ParticipantValidator {
    public void validate(Participant participant) {
        StringBuilder errors = new StringBuilder();

        if (participant.getName() == null || participant.getName().trim().isEmpty()) {
            errors.append("Name cannot be empty.\n");
        }
        if (participant.getIdProba() == null) {
            errors.append("idProba cannot be null.\n");
        }
        if (participant.getNrPuncte() < 0) {
            errors.append("nrPuncte cannot be negative.\n");
        }

        if (errors.length() > 0) {
            throw new ValidationException(errors.toString());
        }
    }
}
