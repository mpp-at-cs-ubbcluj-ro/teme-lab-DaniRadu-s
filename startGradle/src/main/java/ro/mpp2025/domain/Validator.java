package ro.mpp2025.domain;

public interface Validator<T> {
    void validate(T entity) throws ValidationException;
}
