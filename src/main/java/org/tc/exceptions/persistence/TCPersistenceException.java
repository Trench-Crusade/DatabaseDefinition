package org.tc.exceptions.persistence;

import org.tc.exceptions.general.TCGeneralException;

public class TCPersistenceException extends TCGeneralException {
    public TCPersistenceException(String message) {
        super(message);
    }
}
