package org.tc.exceptions.persistence.detailed;

import org.tc.exceptions.persistence.TCPersistenceException;

public class TCInsertFailedException extends TCPersistenceException {
    public TCInsertFailedException(String message) {
        super(message);
    }
}
