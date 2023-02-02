package Terraria;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author kay
 * @version 1.0
 */
public class Menu {

    String name;
    String description;
    String rarity;
    String type;

    public void mainMenu() {
        boolean is_running = true;
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (is_running) {
            System.out.println("""
                    Choose your action:
                    1. add new Entry
                    2. get all Items in short
                    3. get all NPCs
                    4. get all Items
                    5. get all Entries detailed
                    6. delete Entry
                    7. get description of item type
                    8. Exit
                    """);
            int actions = scanner.nextInt();

            switch (actions) {
                case 1 -> createEntry(library);
                case 2 -> library.printEntries();
                case 3 -> library.printNPCs();
                case 4 -> library.printItems();
                case 5 -> library.printEntryDetails();
                case 6 -> deleteEntry(library);
                case 7 -> getTypeDescription();
                case 8 -> is_running = false;
            }
        }
    }

    private void getTypeDescription() {
        // create all possible items to gain ability to get description
        Item item = new Item(null, null, null, null, 0, null);
        Weapon weapon = new Weapon(null, null, null, null,
                0, 0, 0, null);
        Armor armor = new Armor(null, null, null, null,
                0, 0, 0, null);
        Gadget gadget = new Gadget(null, null, null, null,
                0, null, null);
        Potion potion = new Potion(null, null, null, null,
                0, null, 0, null);
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Which description do you want?
                1. Standard
                2. Weapon
                3. Armor
                4. Potion
                5. Gadget
                """);
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> item.getDescriptionOfType();
            case 2 -> weapon.getDescriptionOfType();
            case 3 -> armor.getDescriptionOfType();
            case 4 -> potion.getDescriptionOfType();
            case 5 -> gadget.getDescriptionOfType();
        }

    }

    private void deleteEntry(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the name of the entry which should be deleted?");
        String name = scanner.nextLine();
        library.deleteItem(name, library);
    }

    private void createEntry(Library library) {
        Scanner scanner = new Scanner(System.in);
        getEntryAttributes(scanner);

        switch (type) {
            case "mob", "villager", "boss" -> {
                System.out.println("Is your NPC friendly?");
                boolean friendly = scanner.nextBoolean();
                System.out.println("How much health has the NPC?");
                int health = scanner.nextInt();
                switch (type) {
                    case "mob" -> {
                        createNewMob(library, scanner, friendly, health);
                    }
                    case "villager" -> {
                        createNewVillager(library, scanner, friendly, health);
                    }
                    case "boss" -> {
                        createNewBoss(library, scanner, friendly, health);
                    }
                }
            }
            case "weapon", "armor", "potion", "gadget" -> {
                NPC obtained_by = getNpc(library, scanner);
                System.out.println("Whats the selling price of the item?");
                float selling_price = Float.parseFloat(scanner.nextLine());
                switch (type) {
                    case "weapon" -> {
                        createNewWeapon(library, scanner, obtained_by, selling_price);
                    }
                    case "armor" -> {
                        createNewArmor(library, scanner, obtained_by, selling_price);
                    }
                    case "potion" -> {
                        createNewPotion(library, scanner, obtained_by, selling_price);
                    }
                    case "gadget" -> {
                        createNewGadget(library, scanner, obtained_by, selling_price);
                    }
                }
            }
            default -> System.err.println("Please enter a valid type!");
        }
    }

    private void createNewGadget(Library library, Scanner scanner, NPC obtained_by, float selling_price) {
        System.out.println("Whats the gadget buff?");
        String buff = scanner.nextLine();
        library.newGadget(type, name, description, rarity, obtained_by,
                selling_price, buff, library);
    }

    private void createNewPotion(Library library, Scanner scanner, NPC obtained_by, float selling_price) {
        System.out.println("Whats the potion effect?");
        String effect = scanner.nextLine();
        System.out.println("Whats the potion duration?");
        int duration = scanner.nextInt();
        library.newPotion(type, name, description, rarity, obtained_by,
                selling_price, effect, duration, library);
    }

    private void createNewArmor(Library library, Scanner scanner, NPC obtained_by, float selling_price) {
        System.out.println("Whats the durability of the armor?");
        int durability = scanner.nextInt();
        System.out.println("Whats the defence of the armor?");
        int defence = scanner.nextInt();
        library.newArmor(type, name, description, rarity, obtained_by,
                selling_price, defence, durability, library);
    }

    private void createNewWeapon(Library library, Scanner scanner, NPC obtained_by, float selling_price) {
        System.out.println("Whats the attack damage of the weapon?");
        int attack_damage = scanner.nextInt();
        System.out.println("Whats the durability of the weapon?");
        int durability = scanner.nextInt();
        library.newWeapon(type, name, description, rarity, obtained_by,
                selling_price, attack_damage, durability, library);
    }

    private NPC getNpc(Library library, Scanner scanner) {
        NPC obtained_by = null;
        while (obtained_by == null) {
            System.out.println("Trough who was the item obtained?\n (new or existing NPC)");
            String new_or_existing = scanner.nextLine();
            if (new_or_existing.equalsIgnoreCase("new")) {
                System.out.println("Create a new entry first");
                createEntry(library);
            }
            System.out.println("Whats the name of the NPC?");
            String obtained_by_name = scanner.nextLine();
            obtained_by = getObtainedByNPC(obtained_by_name, library);
        }
        return obtained_by;
    }

    private void createNewBoss(Library library, Scanner scanner, boolean friendly, int health) {
        System.out.println("Whats the incantation Item of your boss?");
        String incantation_item = scanner.nextLine();
        System.out.println("What are the stages of the boss?");
        String stages = scanner.nextLine();
        System.out.println("Whats your bosses attack damage?");
        int attack_damage = scanner.nextInt();
        library.newBoss(type, name, description, rarity, friendly, health,
                attack_damage, incantation_item, stages, library);
    }

    private void createNewVillager(Library library, Scanner scanner, boolean friendly, int health) {
        System.out.println("Does the villager like the environment?");
        boolean likes_environment = scanner.nextBoolean();
        library.newVillager(type, name, description, rarity, friendly,
                health, likes_environment, library);
    }

    private void createNewMob(Library library, Scanner scanner, boolean friendly, int health) {
        System.out.println("Whats the biome of your mob?");
        String biome = scanner.nextLine();
        System.out.println("Whats your mobs attack damage?");
        int attack_damage = scanner.nextInt();
        library.newMob(type, name, description, rarity, friendly,
                health, attack_damage, biome, library);
    }

    private void getEntryAttributes(Scanner scanner) {
        System.out.println("Whats the name of the entry?");
        name = scanner.nextLine();
        System.out.println("Whats the description of the entry?");
        description = scanner.nextLine();
        System.out.println("Whats the rarity of the entry?");
        rarity = scanner.nextLine();
        System.out.println("Whats the entry type? (weapon, armor, portion, gadget, mob, villager, boss)");
        type = scanner.nextLine().toLowerCase();
    }

    private NPC getObtainedByNPC(String name, Library library) {
        for (Entry entry : library.entries) {
            if (Objects.equals(entry.name, name)) {
                if (Objects.equals(entry.type, "mob") || Objects.equals(entry.type, "boss")
                        || Objects.equals(entry.type, "villager")) {
                    return (NPC) entry;
                }
            }
        }
        System.err.println("Please enter a valid name!");
        return null;
    }
}
