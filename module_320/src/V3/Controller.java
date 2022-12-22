package V3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Controller {
    List<Figure> figures = new ArrayList<>();

    public void addFigure(String figureType, String weaponType, String characterName) throws Exception {
        Figure figure;

        switch (figureType) {
            case "warrior" -> figure = new Warrior();
            case "magician" -> figure = new Magician();
            case "villain" -> figure = new Villain();
            default -> throw new Exception("Use a given figure Type");
        }

        switch (weaponType) {
            case "axt" -> {
                AxtBehavior axtBehavior = new AxtBehavior();
                figure.setWeapon(axtBehavior);
            }
            case "stick" -> {
                StickBehaviour stickBehaviour = new StickBehaviour();
                figure.setWeapon(stickBehaviour);
            }
            case "dagger" -> {
                DaggerBehaviour daggerBehaviour = new DaggerBehaviour();
                figure.setWeapon(daggerBehaviour);
            }
            default -> throw new Exception("Use a given weapon Type");
        }
        figure.setCharacterName(characterName);
        figures.add(figure);
    }

    public void removeFigure(String characterName) {
        figures.removeIf(figure -> Objects.equals(figure.characterName, characterName));
    }

    public void printList() {
        for (Figure figure : figures) {
            System.out.println(figure.characterName);
            figure.fight();
        }
    }

}
