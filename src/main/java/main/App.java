package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Scanner sc = new Scanner (System.in);
        Safe safe = new Safe ("0000");

        boolean exit = false;

        while (!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Aseta uusi PIN-koodi:");
                        String newPin = sc.nextLine();
                        safe.changePin(newPin);
                        break;

                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto:");
                        String item = sc.nextLine();
                        safe.addItem(item);
                        break;

                    case 3:
                        System.out.println("Anna PIN-koodi:");
                        String pin = sc.nextLine();
                        ArrayList<String> items = safe.listItems(pin);
                        if (items != null) {
                            for (String s : items) {
                                System.out.println(s);
                            }
                        } else {
                            System.out.println("Väärä PIN-koodi!");
                        }
                    break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }sc.close();
    }
}