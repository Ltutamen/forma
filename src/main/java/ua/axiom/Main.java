package ua.axiom;

import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("[A-Za-z0-9_-]{4,20}").matcher("Aaasa").matches());

        ResourceBundle resources = ResourceBundle.getBundle("textbook_" + (args.length == 0 ? "en" : args[0]));
        Viewer viewer = new Viewer(resources);
        Model model = new Model();

        new Controller(model, viewer, resources).run();

    }
}
