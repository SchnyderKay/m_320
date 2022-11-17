import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedienList {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        MedienList ml = new MedienList();
        System.out.println("What do you want to do? (NewItem/PrintList)");
        String task = scanner.nextLine();
        List<Object> medien = new ArrayList() {};

        switch (task) {
            case "NewItem" -> {
                System.out.println("What item do you want to add? (book/cd/dvd) ");
                String item = scanner.nextLine();
                System.out.println("Please enter the title: ");
                String title = scanner.nextLine();
                System.out.println("Please enter the year: ");
                int year = scanner.nextInt();
                System.out.println("Please enter the price: ");
                double price = scanner.nextDouble();
                switch (item) {
                    case "book" -> medien.add(ml.addBook(title, year, price));
                    case "cd" -> medien.add(ml.addCD(title, year, price));
                    case "dvd" -> medien.add(ml.addDVD(title, year, price));
                }
            }
            case "PrintList" -> System.out.println(medien);
        }


    }
    private Book addBook(String title, int year, double price){
        System.out.println("Please enter the ISBN number: ");
        int ibsn_number = scanner.nextInt();
        return new Book(title, year, price , ibsn_number);
    }
    private DVD addDVD(String title, int year, double price){
        System.out.println("Please enter the length in min: ");
        int lengthInMin = scanner.nextInt();
        return new DVD(title, year, price , lengthInMin);
    }
    private CD addCD(String title, int year, double price){
        System.out.println("Please enter the band name: ");
        String bandName = scanner.nextLine();
        return new CD(title, year, price , bandName);
    }
    private void printList(){

    }
}
