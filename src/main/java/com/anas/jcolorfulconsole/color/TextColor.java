package com.anas.jcolorfulconsole.color;

public class TextColor extends ASCIIColor {

    public static final TextColor DARK_BLACK = new TextColor((short)30);
    public static final TextColor DARK_RED = new TextColor((short)31);
    public static final TextColor DARK_GREEN = new TextColor((short)32);
    public static final TextColor DARK_YELLOW = new TextColor((short)33);
    public static final TextColor DARK_BLUE = new TextColor((short)34);
    public static final TextColor DARK_MAGENTA = new TextColor((short)35);
    public static final TextColor DARK_CYAN = new TextColor((short)36);
    public static final TextColor DARK_WHITE = new TextColor((short)0);
    public static final TextColor DARK_GRY = new TextColor((short)47);

    public static final TextColor TRANSPARENT = new TextColor((short)2);

    public static final TextColor LIGHT_BLACK = new TextColor((short)90);
    public static final TextColor LIGHT_RED = new TextColor((short)91);
    public static final TextColor LIGHT_GREEN = new TextColor((short)92);
    public static final TextColor LIGHT_YELLOW = new TextColor((short)93);
    public static final TextColor LIGHT_BLUE = new TextColor((short)94);
    public static final TextColor LIGHT_MAGENTA = new TextColor((short)95);
    public static final TextColor LIGHT_CYAN = new TextColor((short)96);
    public static final TextColor LIGHT_GRAY = new TextColor((short)97);

    public static final TextColor DEFAULT = new TextColor(ASCIIColor.DEFAULT.getCode());


    protected TextColor(short code) {
        super(code);
    }
}
