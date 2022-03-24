package com.anas.jcolorfulconsole.style;

public class TextStyle extends Style {

    public static final TextStyle DEFAULT = new TextStyle((short) 10);
    public static final TextStyle BOLD = new TextStyle((short) 1);
    public static final TextStyle ITALIC = new TextStyle((short) 3);
    public static final TextStyle UNDERLINE = new TextStyle((short) 4);
    public static final TextStyle STRIKETHROUGH = new TextStyle((short) 9);
    public static final TextStyle DOUBLE_UNDERLINE = new TextStyle((short) 21);
    public static final TextStyle NORMAL_INTENSITY = new TextStyle((short) 22);
    public static final TextStyle FRAKTUR = new TextStyle((short) 20);
    public static final TextStyle ITALIC_INTENSITY = new TextStyle((short) 23);
    public static final TextStyle UNDERLINE_INTENSITY = new TextStyle((short) 24);
    public static final TextStyle BLINK_SLOW = new TextStyle((short) 25);
    public static final TextStyle BLINK_FAST = new TextStyle((short) 26);
    public static final TextStyle NEGATIVE_INTENSITY = new TextStyle((short) 27);
    public static final TextStyle CONCEALED = new TextStyle((short) 28);
    public static final TextStyle CROSSED_OUT = new TextStyle((short) 29);
    public static final TextStyle FRAMED = new TextStyle((short) 54);
    public static final TextStyle ENCIRCLED = new TextStyle((short) 51);
    public static final TextStyle OVERLINED = new TextStyle((short) 53);

    protected TextStyle(short code) {
        super(code);
    }
}
