package com.anas.jcolorfulconsole;

public interface ConsoleManger {
    void setColor(ASCIIColor color);
    void setBackgroundColor(ASCIIColor color);

    void print(String text);
    void print(String text, ASCIIColor color);
    void println(String text);
    void println(String text, ASCIIColor color);
    void println();

    void print(char c);
    void print(char c, ASCIIColor color);
    void println(char c);
    void println(char c, ASCIIColor color);

    void print(int i);
    void print(int i, ASCIIColor color);
    void println(int i);
    void println(int i, ASCIIColor color);

    void print(double d);
    void print(double d, ASCIIColor color);
    void println(double d);
    void println(double d, ASCIIColor color);

    void print(boolean b);
    void print(boolean b, ASCIIColor color);
    void println(boolean b);
    void println(boolean b, ASCIIColor color);

    void print(Object o);
    void print(Object o, ASCIIColor color);
    void println(Object o);
    void println(Object o, ASCIIColor color);

    void printf(String format, Object... args);
}
