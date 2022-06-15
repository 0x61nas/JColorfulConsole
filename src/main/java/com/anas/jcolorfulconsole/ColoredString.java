package com.anas.jcolorfulconsole;

import com.anas.jcolorfulconsole.lanterna.TextColor;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class ColoredString {
    private byte[] strBytes;
    private TextColor foregroundColor;
    private TextColor backgroundColor;
    private ArrayList<TextStyle> styles;

    public ColoredString() {
        this(null);
    }

    public ColoredString(String str, TextStyle... styles) {
        this(str, (TextColor) null, styles);
    }

    public ColoredString(String str, TextColor foregroundColor, TextStyle... styles) {
        this(str, foregroundColor, null, styles);
    }

    public ColoredString(String str, TextColor foregroundColor, TextColor backgroundColor, TextStyle... styles) {
        strBytes = str != null ?
                str.getBytes(StandardCharsets.UTF_8) : null;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
        this.styles = null;
        if (styles != null) {
            this.styles = new ArrayList<>();
            this.styles.addAll(Arrays.asList(styles));
        }
    }

    public ColoredString(String str, String foregroundColor, TextStyle... styles) {
        this(str, foregroundColor, null, styles);
    }

    public ColoredString(String str, String foregroundColor, String backgroundColor, TextStyle... styles) {
        this(str,
                TextColor.Factory.fromString(foregroundColor),
                TextColor.Factory.fromString(backgroundColor),
                styles);
    }


    public void setForegroundColor(TextColor textColor) {
        this.foregroundColor = textColor;
    }

    public void setForegroundColor(String color) {
        this.setForegroundColor(TextColor.Factory.fromString(color));
    }

    public void setBackgroundColor(TextColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColor(String color) {
        this.setBackgroundColor(TextColor.Factory.fromString(color));
    }

    public TextColor getForegroundColor() {
        return foregroundColor;
    }

    public TextColor getBackgroundColor() {
        return backgroundColor;
    }

    public byte[] getBytes() {
        return strBytes;
    }

    public byte[] getColoredBytes() {
        if (strBytes == null) {
            return null;
        }
        return toString().getBytes(StandardCharsets.UTF_8);
    }

    public void setStr(String str) {
        strBytes = str.getBytes(StandardCharsets.UTF_8);
    }

    public void addStyle(TextStyle style) {
        if (styles == null) {
            styles = new ArrayList<>();
        }
        styles.add(style);
    }

    public void removeStyle(TextStyle style) {
        if (styles == null) {
            return;
        }
        styles.remove(style);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        final String escapeSequenceOpen = "\u001b[";
        final String escapeSequenceClose = "\u001b[0m";
        if (styles != null) {
            for (TextStyle style : styles) {
                sb.append(escapeSequenceOpen)
                        .append(style.getValue())
                        .append("m");
            }
        }

        if (foregroundColor != null) {
            sb.append(escapeSequenceOpen);
            sb.append(new String(foregroundColor.getForegroundSGRSequence(), StandardCharsets.UTF_8));
            sb.append("m");
        }
        if (backgroundColor != null) {
            sb.append(escapeSequenceOpen);
            sb.append(new String(backgroundColor.getBackgroundSGRSequence(), StandardCharsets.UTF_8));
            sb.append("m");
        }
        sb.append(this.toNormalStringString());

        if (foregroundColor != null) {
            sb.append(escapeSequenceClose);
        }

        if (backgroundColor != null) {
            sb.append(escapeSequenceClose);
        }

        if (styles != null) {
            for (int i = 0; i < styles.size(); i++) {
                sb.append(escapeSequenceClose);
            }
        }

        return sb.toString();
    }
    public String toNormalStringString() {
        return strBytes == null || strBytes.length < 1 ?
                null : new String(strBytes, StandardCharsets.UTF_8);
    }
}
