package com.anas.jcolorfulconsole;

import com.anas.jcolorfulconsole.color.BackgroundColor;
import com.anas.jcolorfulconsole.color.TextColor;

public interface ConsoleManager {
    void setColor(TextColor textColor);
    void setBackgroundColor(BackgroundColor backgroundColor);
    void setProperty(ConsoleProperty property);

    void print(String text);
    void print(String text, ConsoleProperty... properties);
    void println(String text);
    void println(String text, ConsoleProperty... properties);
    void println();

    void print(char c);
    void print(char c, ConsoleProperty... properties);
    void println(char c);
    void println(char c, ConsoleProperty... properties);

    void print(int i);
    void print(int i, ConsoleProperty... properties);
    void println(int i);
    void println(int i, ConsoleProperty... properties);

    void print(double d);
    void print(double d, ConsoleProperty... properties);
    void println(double d);
    void println(double d, ConsoleProperty... properties);

    void print(boolean b);
    void print(boolean b, ConsoleProperty... properties);
    void println(boolean b);
    void println(boolean b, ConsoleProperty... properties);

    void print(Object o);
    void print(Object o, ConsoleProperty... properties);
    void println(Object o);
    void println(Object o, ConsoleProperty... properties);

    void printf(String format, Object... args);
}
