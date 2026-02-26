package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Character;
import org.example.model.Dwarf;
import org.example.model.Elf;
import org.example.model.Hobbit;
import org.example.model.Human;
import org.example.model.Orc;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        Elf elf1 = new Elf("Legolas", 2931, "Bow", "Mirkwood", 95, 98, true);
        Elf elf2 = new Elf("Tauriel", 600, "Daggers", "Woodland Realm", 88, 91, true);
        Elf elf3 = new Elf("Elrond", 6500, "Sword", "Rivendell", 92, 85, true);

        Dwarf dwarf1 = new Dwarf("Gimli", 139, "Axe", "Erebor", 97, 45.0, "Battle Axe");
        Dwarf dwarf2 = new Dwarf("Thorin", 195, "Oak Shield", "Blue Mountains", 93, 52.5, "War Axe");
        Dwarf dwarf3 = new Dwarf("Dwalin", 169, "Hammer", "Ered Luin", 94, 60.2, "Twin Axes");

        Human human1 = new Human("Aragorn", 87, "Anduril", "Gondor", 99, "Gondor", 100);
        Human human2 = new Human("Boromir", 41, "Sword", "Minas Tirith", 90, "Gondor", 82);
        Human human3 = new Human("Eowyn", 24, "Spear", "Rohan", 89, "Rohan", 76);

        Hobbit hobbit1 = new Hobbit("Frodo", 50, "Sting", "Shire", 85, 92, true);
        Hobbit hobbit2 = new Hobbit("Sam", 38, "Pan", "Shire", 87, 80, true);
        Hobbit hobbit3 = new Hobbit("Merry", 36, "Dagger", "Shire", 83, 78, true);

        Orc orc1 = new Orc("Azog", 45, "Mace", "Moria", 88, 95, "Gundabad");
        Orc orc2 = new Orc("Gorbag", 33, "Scimitar", "Mordor", 82, 84, "Morgul");
        Orc orc3 = new Orc("Snaga", 27, "Club", "Isengard", 76, 70, "Uruk-hai");

        characters.add(elf1);
        characters.add(elf2);
        characters.add(elf3);
        characters.add(dwarf1);
        characters.add(dwarf2);
        characters.add(dwarf3);
        characters.add(human1);
        characters.add(human2);
        characters.add(human3);
        characters.add(hobbit1);
        characters.add(hobbit2);
        characters.add(hobbit3);
        characters.add(orc1);
        characters.add(orc2);
        characters.add(orc3);

        for (Character c : characters) {
            System.out.println(c.getDetails());
        }
    }
}
