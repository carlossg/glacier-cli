package org.csanchez.aws.glacier;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Valid commands for Glacier CLI
 */
public enum GlacierCliCommand {

    INVENTORY("inventory"),
    UPLOAD("upload"),
    DOWNLOAD("download"),
    DELETE("delete"),
    LIST("list"),
    INFO("info"),
    DELETE_VAULT("delete-vault"),
    CREATE_VAULT("create-vault");

    private static final Map<String, GlacierCliCommand> lookup
            = new HashMap<String, GlacierCliCommand>();

    static {
        for (GlacierCliCommand command : EnumSet.allOf(GlacierCliCommand.class)) {
            lookup.put(command.getCode(), command);
        }
    }

    private String code;

    private GlacierCliCommand(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static GlacierCliCommand get(String code) {
        return lookup.get(code);
    }
}
