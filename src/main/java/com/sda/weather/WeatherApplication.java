package com.sda.weather;

import com.sda.weather.entry.EntryController;

import java.util.Scanner;

public class WeatherApplication {

    private final EntryController entryController;

    public UserInterface(EntryController entryController) {
        this.entryController = entryController;
    }

    public void run() {
        System.out.println("Aplikacja jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWitaj, co chcesz zrobić?");
            System.out.println("1. Dodać lokalizację");
            System.out.println("0. Zamknąć aplikację");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createLocation();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }

//    private void createEntry() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj lokalizacje: ");
//        String content = scanner.nextLine();
//        // HTTP REQUEST -> POST: /entry
//        String requestBody = String.format("{\"title\":\"%s\",\"content\":\"%s\"}", title, content);
//        System.out.println("Wysyłany http request: " + requestBody);
//        String responseBody = entryController.createEntry(requestBody);
//        System.out.println("Odebrany http response: " + responseBody);
//    }
}
