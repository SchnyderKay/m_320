package JavaRepetition;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SmallProject {
    public static void main(String[] args) {
        System.out.println("Donald ones said:");
        boolean isRunning = true;
        List<String> statements = readFile();
        Scanner sc= new Scanner(System.in);

        while (isRunning){
            int random_int = new Random().nextInt(statements.size() + 1);
            System.out.println(statements.get(random_int));
            System.out.println("- Donald J. Trump");
            System.out.println("New statement? (Yes/No)");
            String userInput = sc.nextLine();

            if (!userInput.equalsIgnoreCase("yes")){
                isRunning = false;
            }

        }

    }

    private static List<String> readFile() {
        List<String> lines = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "JavaRepetition/src/statements.txt"));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
