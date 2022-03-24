package com.anas.jcolorfulconsole.color;

public class BackgroundColor extends ASCIIColor {

    public static final BackgroundColor DARK_BLACK = new BackgroundColor((short)40);
    public static final BackgroundColor DARK_RED = new BackgroundColor((short)41);
    public static final BackgroundColor DARK_GREEN = new BackgroundColor((short)42);
    public static final BackgroundColor DARK_YELLOW = new BackgroundColor((short)43);
    public static final BackgroundColor DARK_BLUE = new BackgroundColor((short)44);
    public static final BackgroundColor DARK_MAGENTA = new BackgroundColor((short)45);
    public static final BackgroundColor DARK_CYAN = new BackgroundColor((short)46);
    public static final BackgroundColor DARK_WHITE = new BackgroundColor((short)7);
    public static final BackgroundColor DARK_GRAY = new BackgroundColor((short)47);


    public static final BackgroundColor LIGHT_BLACK = new BackgroundColor((short)100);
    public static final BackgroundColor LIGHT_RED = new BackgroundColor((short)101);
    public static final BackgroundColor LIGHT_GREEN = new BackgroundColor((short)102);
    public static final BackgroundColor LIGHT_YELLOW = new BackgroundColor((short)103);
    public static final BackgroundColor LIGHT_BLUE = new BackgroundColor((short)104);
    public static final BackgroundColor LIGHT_MAGENTA = new BackgroundColor((short)105);
    public static final BackgroundColor LIGHT_CYAN = new BackgroundColor((short)106);
    public static final BackgroundColor LIGHT_WHITE = new BackgroundColor((short)7);
    public static final BackgroundColor LIGHT_GRAY = new BackgroundColor((short)107);

    public static final BackgroundColor DEFAULT = new BackgroundColor(ASCIIColor.DEFAULT.getCode());

    protected BackgroundColor(short code) {
        super(code);
    }
}
