package com.anas.jcolorfulconsole.color;

import com.anas.jcolorfulconsole.ConsoleProperty;

public class ASCIIColor implements ConsoleProperty {
    private final short code;

    protected ASCIIColor(short code) {
        this.code = code;
    }

    public static final ASCIIColor DEFAULT = new ASCIIColor((short)-1);

    @Override
    public short getCode() {
        return code;
    }
}
