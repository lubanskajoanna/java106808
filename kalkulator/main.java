package Kalkulator;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\t \n MENU");
            System.out.println("Obliczenia z Command Line : wciśnij 1");
            System.out.println("Obliczenia z pliku tekstowego : wciśnij 2");
            System.out.println("Koniec programu : wciśnij 3");

            try {
                int choosedNumber = Integer.parseInt(JOptionPane.showInputDialog("Wybierz funkcje"));

                if (choosedNumber == 3) {
                    System.out.println("Koniec programu");
                    return;
                } else if (choosedNumber == 1) {
                    System.out.println("Napisz równanie oraz wciśnij enter by dostać wynik");
                    System.out.println("Liczby zmienno przecinkowe będą zamienione na całkowite.");
                    Scanner scan = new Scanner(System.in);
                    String temp = scan.nextLine();
                    Kalkulator.RunCalculator(temp);
                } else if (choosedNumber == 2) {
                    System.out.println("Wczytanie równania z pliku tekstowego");
                    System.out.println("Plik zostanie wczytany z folderu w którym znajduję się program");
                    File file =
                            new File("C:\\Users\\user\\Desktop\\Kalkulator-Java\\src\\Kalkulator\\plik.txt");
                    Scanner sc;

                    int lineCount = 0;
                    {
                        try {
                            sc = new Scanner(file);
                        } catch (FileNotFoundException e) {
                            System.out.println("Brak pliku ze ścieżką " + e.getLocalizedMessage());
                            System.out.println("Spróbuj jeszcze raz");
                            continue;
                        }
                    }
                    while (sc.hasNextLine()) {
                        lineCount++;
                        System.out.println("Wczytanie linii numer " + lineCount);
                        String writenFromFile = sc.nextLine();
                        Kalkulator.RunCalculator(writenFromFile);
                    }
                    System.out.println("Brak kolejnych linii równań do obliczenia");
                    System.out.println("Powrót do menu");

                } else {
                    System.out.println("Nie podałeś jednej z możliwych liczb ! Spróbuj jeszcze raz.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Wystąpił błąd -> " + e.getMessage());
                System.out.println("Najprawdopodobniej nie podałeś liczby ! - koniec programu");
                return;
            }
        }
    }
}
