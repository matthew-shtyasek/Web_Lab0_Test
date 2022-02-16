import hero.Batman;
import hero.Human;
import hero.IronMan;
import hero.SpiderMan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Who are you?\n- ");
        String name = reader.readLine();
        reader.close();
        if (Pattern.compile("^[A-Z][a-z]* [A-Z][a-z]*$").matcher(name).matches()) {
            Human human;
            String[] names = name.split(" ");
            switch (names[0]) {
                case "Iron":
                    human = new IronMan(names[1]);
                    break;
                case "Spider":
                    human = new SpiderMan(names[1]);
                    break;
                case "Batman":
                    human = new Batman(names[1]);
                    break;
                default:
                    human = new Human(name);
            }
            System.out.printf("Hello, %s!", human.whoAmI());
        } else {
            System.out.println("Неверный формат ввода!\nДанные должны вводиться в виде: \"Имя Фамилия\".");
        }
    }
}
