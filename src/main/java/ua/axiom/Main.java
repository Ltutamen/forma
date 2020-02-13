package ua.axiom;

import ua.axiom.model.Model;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        ResourceBundle resources = ResourceBundle.getBundle("textbook_" + (args.length == 0 ? "en" : args[0]));
        Viewer viewer = new Viewer(resources);
        Model model = new Model();

        new Controller(model, viewer, resources).run();


    }
}
