package design.pattern.projet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    public String getGreeting() {
        Coffre coffre = new Coffre();
        System.out.println(coffre);
        Unite unite= new Unite(5, TypeUnite.MINEUR );
        System.out.println(unite);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
