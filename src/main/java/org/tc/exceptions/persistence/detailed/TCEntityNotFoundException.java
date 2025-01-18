package org.tc.exceptions.persistence.detailed;

import org.tc.exceptions.persistence.TCPersistenceException;

public class TCEntityNotFoundException extends TCPersistenceException {
    public TCEntityNotFoundException(String message) {
        super(message);
    }
}
