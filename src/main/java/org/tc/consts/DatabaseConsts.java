package org.tc.consts;

import org.tc.exceptions.general.detailed.TCUtilityClassException;

public class DatabaseConsts {

    private DatabaseConsts() throws TCUtilityClassException {
        throw new TCUtilityClassException("Utility class");
    }

    public static final String USER_TABLE = "user";
    public static final String USER_ACTIVATION_TABLE = "user_activation";

}
