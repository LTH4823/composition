package org.zerock;

import java.util.Scanner;

public abstract class AbstractUI implements Auth{

    private Scanner scanner;

    public void print(String msg){
        System.out.println(msg);
    }

    public int inputInt(String msg){
        System.out.println(msg);
        return Integer.parseInt(scanner.nextLine());
    }

}
