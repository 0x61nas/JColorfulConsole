package com.anas.jcolorfulconsole;

import com.anas.jcolorfulconsole.color.ASCIIColor;

public interface ConsoleManger {
    void setColor(ConsoleProperty property);
    void setBackgroundColor(ASCIIColor color);
    void setProperty(ConsoleProperty property);

    void print(String text);
    void print(String text, ConsoleProperty property);
    void println(String text);
    void println(String text, ConsoleProperty property);
    void println();

    void print(char c);
    void print(char c, ConsoleProperty property);
    void println(char c);
    void println(char c, ConsoleProperty property);

    void print(int i);
    void print(int i, ConsoleProperty property);
    void println(int i);
    void println(int i, ConsoleProperty property);

    void print(double d);
    void print(double d, ConsoleProperty property);
    void println(double d);
    void println(double d, ConsoleProperty property);

    void print(boolean b);
    void print(boolean b, ConsoleProperty property);
    void println(boolean b);
    void println(boolean b, ConsoleProperty property);

    void print(Object o);
    void print(Object o, ConsoleProperty property);
    void println(Object o);
    void println(Object o, ConsoleProperty property);

    void printf(String format, Object... args);
}
