package com.anas.jcolorfulconsole.stringmake;

import com.anas.jcolorfulconsole.ConsoleProperty;

public class StringProcessor {
    public String addPropertiesEscape(String str, ConsoleProperty... properties) {
        StringBuilder sb = new StringBuilder();
        for (int i = properties.length; i > 0; i--) {
            sb.append(getEscapedText(properties[i - 1]));
        }
        sb.append(str);
        for (int i = properties.length; i > 0; i--) {
            sb.append(closeEscapedText());
        }
        return sb.toString();
    }

    public String getEscapedText(ConsoleProperty property) {
        return "\033[" + property.getCode() + "m";
    }

    public String closeEscapedText() {
        return "\033[m";
    }

    private String getTerminalType() {
        return System.getenv("TERM");
    }
}
