package ua.axiom;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private Viewer viewer;

    private ResourceBundle resources;
    private boolean isRunning;

    public Controller(Model model, Viewer viewer,ResourceBundle resources) {
        this.model = model;
        this.viewer = viewer;
        this.resources = resources;
        this.isRunning = true;
    }

    public void run() {
        Scanner scn = new Scanner(System.in);


        String login = getInput(
                scn, resources, "LOGIN");

        String password = getInput(
                scn, resources, "PSW");


    }

    private String getInput(Scanner scanner, String welcomeMsg, String regex, String correctInputMsg, String wrongInputMsg) {
        Pattern pattern = Pattern.compile(regex);

        viewer.output(welcomeMsg);

        while (true) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            if(matcher.matches()) {
                viewer.output(correctInputMsg);
                return matcher.group();

            } else {
                viewer.output(viewer.getRegexHintMsg(regex, wrongInputMsg));
            }
        }
    }

    private String getInput(Scanner scanner, ResourceBundle resources, String propertiesPrefix) {
        Pattern pattern = Pattern.compile(resources.getString("REGEX." + propertiesPrefix + "_REGEX"));

        viewer.output(resources.getString("MESSAGE." + propertiesPrefix + "_REQUEST_MSG"));

        while (true) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            if(matcher.matches()) {
                viewer.output(resources.getString("MESSAGE.CORRECT_" + propertiesPrefix + "_INPUT_FORMAT"));
                return matcher.group();

            } else {
                viewer.output(
                        viewer.getRegexHintMsg(
                                resources.getString("REGEX." + propertiesPrefix + "_REGEX"),
                                resources.getString("MESSAGE.WRONG_" + propertiesPrefix + "_INPUT_FORMAT")));
            }
        }
    }
}
