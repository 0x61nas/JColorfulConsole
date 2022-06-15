package test;

import com.anas.jcolorfulconsole.ColoredString;
import com.anas.jcolorfulconsole.TextStyle;
import com.anas.jcolorfulconsole.lanterna.TextColor;

public class Main {
    public static void main(String[] args) {
        ColoredString coloredString = new ColoredString("Hello World", null, "blue", TextStyle.BOLD, TextStyle.ITALIC);
        System.out.println(coloredString);

        new Thread(() -> {
            while (true) {
                System.out.println(new ColoredString("Hi",
                        new TextColor.RGB((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)),
                        new TextColor.RGB((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)),
                        TextStyle.values()[(int) (Math.random() * TextStyle.values().length)]));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
