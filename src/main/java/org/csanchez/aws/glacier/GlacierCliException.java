package org.csanchez.aws.glacier;

/**
 * Custom exception class for Glacier CLI
 */
public class GlacierCliException extends RuntimeException {

    public GlacierCliException(String message) {
        super(message);
    }
}
