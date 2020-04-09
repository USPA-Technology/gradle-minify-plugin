package org.padler.gradle.minify.minifier;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private final List<Error> errors = new ArrayList<>();
    private final List<Warning> warnings = new ArrayList<>();

    public void add(Error error) {
        errors.add(error);
    }

    public void add(Warning warning) {
        warnings.add(warning);
    }

    public List<Error> getErrors() {
        return errors;
    }

    public List<Warning> getWarnings() {
        return warnings;
    }
}
