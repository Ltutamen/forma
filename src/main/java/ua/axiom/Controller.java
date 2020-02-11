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
                scn,
                resources.getString("REGEX.LOGIN_REGEX"),
                resources.getString("MESSAGE.CORRECT_LOGIN_INPUT_FORMAT"),
                resources.getString("MESSAGE.WRONG_LOGIN_INPUT_FORMAT"));
        String password = getInput(
                scn,
                resources.getString("REGEX.PASSWORD_REGEX"),
                resources.getString("MESSAGE.CORRECT_PSW_INPUT_FORMAT"),
                resources.getString("MESSAGE.WRONG_PSW_INPUT_FORMAT"));

    }

    private String getInput(Scanner s, String regex, String correctInputMsg, String wrongInputMsg) {
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            Matcher matcher = pattern.matcher(s.nextLine());
            if(matcher.matches()) {
                viewer.output(correctInputMsg);
                return matcher.group();
            }
            else
                viewer.output(wrongInputMsg);
        }

    }
}
