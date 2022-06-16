## JColorfulConsole

### JColorfulConsole is a console color library.
[![](https://jitpack.io/v/Anas-Elgarhy/JColorfulConsole.svg)](https://jitpack.io/#Anas-Elgarhy/JColorfulConsole)

### Features:
 - Support text color.
 - Support background color.
 - Support 256 colors (RGB).
 - Support ANSI colors.
 - Support indexed colors.
 - Support text style.
 - Lightweight and fast.
 - Easy to use.

### How to add this library into your project
**Step 1**. Add the dependency
```xml
<dependency>
    <groupId>com.anas.jcolorfulconsole</groupId>
    <artifactId>jcolorfulconsole</artifactId>
    <version>0.1.5</version>
</dependency>
```

#### Gradle:
**Step 1**. Add the JitPack repository to your build file<br>
*Add it in your root build.gradle at the end of repositories:*
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**Step 2**. Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.Anas-Elgarhy:JColorfulConsole:0.1.5'
	}
```

## Usage:

```java
public class Example1 {
    public static void main(String[] args) {
        ColoredString hello = new ColoredString("Hello, ");
        hello.setForegroundColor(TextColor.ANSI.BLUE); // Set text color to blue
        hello.setBackgroundColor("magenta"); // Set background color to magenta
        hello.addStyle(TextStyle.BOLD); // Add bold style

        ColoredString world = new ColoredString();
        world.setStr("World!"); // Set string to "World!"
        world.setForegroundColor("#542413"); // Set text color
        world.setBackgroundColor(new TextColor.RGB(34, 139, 34)); // Set background color
        world.addStyle(TextStyle.ITALIC); // Add italic style

        System.out.print(hello); // Print colored string
        System.out.print(world); // Print colored string

    }
}
```
![Result of example 1](./Screenshots/1.0.1-example1.png)

```java
public class Example2 {
    public static void main(String[] args) {
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
```
![Result of example 2](./Screenshots/1.0.1-example2.gif)

## Requirements for development:
- Maven
- jdk 17
- IntelliJ IDEA (not required but recommended)

## TODO
- [ ] Add Tests
- [ ] Add Formatter
- [ ] Add Documentation
- [ ] Add more examples

### Available in

[![GitHub](https://img.shields.io/badge/GitHub-Main%20repo-brightgreen?style=for-the-badge&logo=GitHub)](https://github.com/Anas-Elgarhy/jpwd)
[![GitLab](https://img.shields.io/badge/GitLab-Mirror%20repo-brightgreen?style=for-the-badge&logo=GitLab)](https://gitlab.com/java-utils1/jpwd)
[![BitBucket](https://img.shields.io/badge/BitBucket-Mirror%20repo-brightgreen?style=for-the-badge&logo=BitBucket)](https://bitbucket.org/anas_elgarhy/jpwd)
[![Codeberg](https://img.shields.io/badge/Codeberg-Mirror%20repo-brightgreen?style=for-the-badge&logo=Codeberg)](https://codeberg.org/java-utils/jpwd)


[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=Anas-Elgarhy_jpwd)](https://sonarcloud.io/summary/new_code?id=Anas-Elgarhy_jpwd)


[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/summary/new_code?id=Anas-Elgarhy_jpwd)

![License: GPL-3.0](https://img.shields.io/badge/License-GPL%203.0-blue.svg)
