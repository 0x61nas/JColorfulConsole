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

    /**
     * Create a new empty ColoredString object
     */
    public ColoredString() {
        this(null);
    }

    /**
     * Create a new ColoredString object with the given string
     * @param str The string to be colored
     * @param styles The styles to be applied to the string (optional)
     */
    public ColoredString(String str, TextStyle... styles) {
        this(str, (TextColor) null, styles);
    }

    /**
     * Create a new ColoredString object with the given string and foreground color
     * @param str The string to be colored
     * @param foregroundColor The foreground color to be applied to the string
     * @param styles The styles to be applied to the string (optional)
     */
    public ColoredString(String str, TextColor foregroundColor, TextStyle... styles) {
        this(str, foregroundColor, null, styles);
    }

    /**
     * Create a new ColoredString object with the given string and foreground and background colors
     * @param str The string to be colored
     * @param foregroundColor The foreground color to be applied to the string
     * @param backgroundColor The background color to be applied to the string
     * @param styles The styles to be applied to the string (optional)
     */
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

    /**
     * Create a new ColoredString object with the given string and foreground color as string of name of the color or hexadecimal color code
     * @param str The string to be colored
     * @param foregroundColor The foreground color to be applied to the string as string of name of the color or hexadecimal color code
     * @param styles The styles to be applied to the string (optional)
     */
    public ColoredString(String str, String foregroundColor, TextStyle... styles) {
        this(str, foregroundColor, null, styles);
    }

    /**
     * Create a new ColoredString object with the given string and foreground and background colors as string of name of the color or hexadecimal color code
     * @param str The string to be colored
     * @param foregroundColor The foreground color to be applied to the string as string of name of the color or hexadecimal color code
     * @param backgroundColor The background color to be applied to the string as string of name of the color or hexadecimal color code
     * @param styles The styles to be applied to the string (optional)
     */
    public ColoredString(String str, String foregroundColor, String backgroundColor, TextStyle... styles) {
        this(str,
                TextColor.Factory.fromString(foregroundColor),
                TextColor.Factory.fromString(backgroundColor),
                styles);
    }

    /**
     * Set the foreground color (text color)
     * @param textColor The foreground color to be applied to the string
     */
    public void setForegroundColor(TextColor textColor) {
        this.foregroundColor = textColor;
    }

    /**
     * Set the foreground color (text color) as string of name of the color or hexadecimal color code
     * @param textColor The foreground color to be applied to the string as string of name of the color or hexadecimal color code
     */
    public void setForegroundColor(String textColor) {
        this.setForegroundColor(TextColor.Factory.fromString(textColor));
    }

    /**
     * Set the background color
     * @param backgroundColor The background color to be applied to the string
     */
    public void setBackgroundColor(TextColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    /**
     * Set the background color as string of name of the color or hexadecimal color code
     * @param backgroundColor The background color to be applied to the string as string of name of the color or hexadecimal color code
     */
    public void setBackgroundColor(String backgroundColor) {
        this.setBackgroundColor(TextColor.Factory.fromString(backgroundColor));
    }

    /**'
     * Get the foreground color (text color)
     * @return The foreground color, null if not set
     */
    public TextColor getForegroundColor() {
        return foregroundColor;
    }

    /**
     * Get the background color
     * @return The background color, null if not set
     */
    public TextColor getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Get the string as byte array
     * @return The string as byte array
     */
    public byte[] getBytes() {
        return strBytes;
    }

    /**
     * Get the string with the applied styles and colors as byte array
     * @return The string with the applied styles and colors as byte array
     */
    public byte[] getColoredBytes() {
        if (strBytes == null) {
            return null;
        }
        return toString().getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Set the string
     * @param str The string to be colored
     */
    public void setStr(String str) {
        strBytes = str.getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Add style to the string
     * @param style The style to be applied to the string
     */
    public void addStyle(TextStyle style) {
        if (styles == null) {
            styles = new ArrayList<>();
        }
        styles.add(style);
    }

    /**
     * Remove style from the string
     * @param style The style to be removed from the string
     */
    public void removeStyle(TextStyle style) {
        if (styles == null) {
            return;
        }
        styles.remove(style);
    }


    /**
     * Get the string with the applied styles and colors
     * @return The string with the applied styles and colors
     */
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

    /**
     * Get the string without the applied styles and colors
     * @return The string without the applied styles and colors
     */
    public String toNormalStringString() {
        return strBytes == null || strBytes.length < 1 ?
                null : new String(strBytes, StandardCharsets.UTF_8);
    }
}
