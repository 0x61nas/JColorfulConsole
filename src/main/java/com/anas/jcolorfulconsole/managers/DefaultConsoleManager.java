package com.anas.jcolorfulconsole.managers;

import com.anas.jcolorfulconsole.ConsoleManager;
import com.anas.jcolorfulconsole.ConsoleProperty;
import com.anas.jcolorfulconsole.color.BackgroundColor;
import com.anas.jcolorfulconsole.color.TextColor;
import com.anas.jcolorfulconsole.stringmake.StringProcessor;

import java.util.ArrayList;

public class DefaultConsoleManager implements ConsoleManager {
    private final ArrayList<ConsoleProperty> properties;
    private final StringProcessor stringProcessor;

    public DefaultConsoleManager() {
        this.properties = new ArrayList<>();
        this.stringProcessor = new StringProcessor();

        properties.add(TextColor.DEFAULT);
        properties.add(BackgroundColor.DEFAULT);
    }

    @Override
    public void setTextColor(TextColor textColor) {
        properties.set(0, textColor);
    }

    @Override
    public void setBackgroundColor(BackgroundColor backgroundColor) {
        properties.set(1, backgroundColor);
    }

    @Override
    public void addProperty(ConsoleProperty property) {
        properties.add(property);
    }

    @Override
    public void removeProperty(ConsoleProperty property) {
        properties.remove(property);
    }

    @Override
    public void print(String str) {
        System.out.print(stringProcessor.addPropertiesEscape(str,
                properties.toArray(new ConsoleProperty[0])));
    }

    @Override
    public void print(String str, ConsoleProperty... properties) {
        System.out.print(stringProcessor.addPropertiesEscape(str, properties));
    }

    @Override
    public void println(String str) {
        this.print(str + "\n");
    }

    @Override
    public void println(String str, ConsoleProperty... properties) {
        this.print(str + "\n", properties);
    }

    @Override
    public void println() {
        this.println("");
    }

    @Override
    public void print(char c) {
        this.print(String.valueOf(c));
    }

    @Override
    public void print(char c, ConsoleProperty... properties) {
        this.print(String.valueOf(c), properties);
    }

    @Override
    public void println(char c) {
        this.print(c + "\n");
    }

    @Override
    public void println(char c, ConsoleProperty... properties) {
        this.print(c, properties);
    }

    @Override
    public void print(int i) {
        this.print(String.valueOf(i));
    }

    @Override
    public void print(int i, ConsoleProperty... properties) {
        this.print(String.valueOf(i), properties);
    }

    @Override
    public void println(int i) {
        this.print(i + "\n");
    }

    @Override
    public void println(int i, ConsoleProperty... properties) {
        this.print(i, properties);
    }

    @Override
    public void print(double d) {
        this.print(String.valueOf(d));
    }

    @Override
    public void print(double d, ConsoleProperty... properties) {
        this.print(String.valueOf(d), properties);
    }

    @Override
    public void println(double d) {
        this.println(String.valueOf(d));
    }

    @Override
    public void println(double d, ConsoleProperty... properties) {
        this.print(d, properties);
    }

    @Override
    public void print(boolean b) {
        this.print(String.valueOf(b));
    }

    @Override
    public void print(boolean b, ConsoleProperty... properties) {
        this.print(String.valueOf(b), properties);
    }

    @Override
    public void println(boolean b) {
        this.println(String.valueOf(b));
    }

    @Override
    public void println(boolean b, ConsoleProperty... properties) {
        this.print(b, properties);
    }

    @Override
    public void print(Object o) {
        this.print(o.toString());
    }

    @Override
    public void print(Object o, ConsoleProperty... properties) {
        this.print(o.toString(), properties);
    }

    @Override
    public void println(Object o) {
        this.println(o.toString());
    }

    @Override
    public void println(Object o, ConsoleProperty... properties) {
        this.print(o.toString(), properties);
    }

    @Override
    public void printf(String format, Object... args) {
        this.print(String.format(format, args));
    }
}
