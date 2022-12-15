package V1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MedienList {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        MedienList ml = new MedienList();
        List<Object> medien = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("What do you want to do? (NewItem/PrintList/Exit/DeleteItem)");
            String task = scanner.nextLine();

            switch (task) {
                case "NewItem" -> {
                    System.out.println("What type do you want to add? (Book/CD/DVD) ");
                    String type = scanner.nextLine();
                    System.out.println("Please enter the title: ");
                    String title = scanner.nextLine();
                    System.out.println("Please enter the year: ");
                    int year = scanner.nextInt();
                    System.out.println("Please enter the price: ");
                    double price = scanner.nextDouble();
                    switch (type.toLowerCase()) {
                        case "book" -> medien.add(ml.addBook(title, year, price, type));
                        case "cd" -> medien.add(ml.addCD(title, year, price, type));
                        case "dvd" -> medien.add(ml.addDVD(title, year, price, type));
                    }
                }
                case "PrintList" -> ml.printList(medien);
                case "DeleteItem" -> {
                    System.out.println("What title has the item, which you want to delete?");
                    String title = scanner.nextLine();
                    medien = ml.deleteItem(medien, title);
                }
                case "Exit" -> isRunning = false;
            }
        }


    }

    private CD addCD(String title, int year, double price, String type) {
        System.out.println("Please enter the bandname: ");
        String bandname = scanner.nextLine();
        while (bandname.isBlank()){
            bandname = scanner.nextLine();
            System.out.print("");
        }
        return new CD(title, year, price, type, bandname);
    }
    private Book addBook(String title, int year, double price, String type) {
        System.out.println("Please enter the ISBN number: ");
        int ibsn_number = scanner.nextInt();
        return new Book(title, year, price, type, ibsn_number);
    }
    private DVD addDVD(String title, int year, double price, String type) {
        System.out.println("Please enter the length in min: ");
        int lengthInMin = scanner.nextInt();
        return new DVD(title, year, price, type, lengthInMin);
    }

    private void printList(List<Object> medien) {
        for (Object media_object : medien) {
            Medien media = (Medien) media_object;
            System.out.println("----------------------------------");
            System.out.println(media.getTitle());
            System.out.println(media.getYear());
            System.out.println(media.getPrice());

            if (Objects.equals(media.getType().toLowerCase(), "book")) {
                Book book = (Book) media_object;
                System.out.println(book.getISBN_Number());
            } else if (Objects.equals(media.getType().toLowerCase(), "cd")) {
                CD cd = (CD) media_object;
                System.out.println(cd.getBandname());
            } else {
                DVD dvd = (DVD) media_object;
                System.out.println(dvd.getLengthInMin());
            }
        }
    }

    private List<Object> deleteItem(List<Object> medien, String title) {
        for (int i = 0; i <= medien.size(); i++) {
            Medien media = (Medien) medien.get(0);

            if (Objects.equals(media.getTitle(), title)) {
                medien.remove(i);
            }
        }
        return medien;
    }
}
