package org.tc.exceptions.persistence.detailed;

import org.tc.exceptions.persistence.TCPersistenceException;

public class TCUpdateFailedException extends TCPersistenceException {
    public TCUpdateFailedException(String message) {
        super(message);
    }
}
