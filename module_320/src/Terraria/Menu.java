package Terraria;

import java.util.Scanner;

public class Menu {
    public void main_menu(){
        boolean is_running = true;
        Scanner scanner = new Scanner(System.in);

        while (is_running){
            System.out.println("Choose your action: " +
                    "1. add new Entry" +
                    "2. get all Items" +
                    "3. get all NPCs" +
                    "4. get detail of specific Entry" +
                    "5. Exit");
            int actions = scanner.nextInt();

            switch (actions){
                case 1:

            }
        }
    }
}
