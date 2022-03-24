package com.anas.jcolorfulconsole.style;

import com.anas.jcolorfulconsole.ConsoleProperty;

public abstract class Style implements ConsoleProperty {
    private final short code;

    protected Style(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }
}
