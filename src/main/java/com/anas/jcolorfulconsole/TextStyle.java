package com.anas.jcolorfulconsole;

public enum TextStyle {
    DEFAULT(10),
    BOLD(1),
    ITALIC(3),
    UNDERLINE(4),
    BLINK(5),
    STRIKETHROUGH(9),
    DOUBLE_UNDERLINE(21),
    NORMAL_INTENSITY(22),
    FRAKTUR(20),
    ITALIC_INTENSITY(23),
    UNDERLINE_INTENSITY(24),
    BLINK_SLOW(25),
    BLINK_FAST(26),
    NEGATIVE_INTENSITY(27),
    CONCEALED(28),
    CROSSED_OUT(29),
    FRAMED(54),
    ENCIRCLED(51),
    OVERLINED(53),
    ;

    private final byte value;

    TextStyle(int value) {
        this.value = (byte) value;
    }

    public byte getValue() {
        return value;
    }
}
