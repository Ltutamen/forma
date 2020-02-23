package ua.axiom;

import ua.axiom.model.Entity;
import ua.axiom.model.EntityAlreadyExistException;
import ua.axiom.model.Model;
import ua.axiom.viewer.Viewer;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private Viewer viewer;

    private ResourceBundle resources;
    private boolean isRunning;

    public Controller(Model model, Viewer viewer, ResourceBundle resources) {
        this.model = model;
        this.viewer = viewer;
        this.resources = resources;
        this.isRunning = true;
    }

    public void run() {
        this.run(new Scanner(System.in));
    }

    public void run(Scanner scn) {
        while (true) {
            try {
                String name = getInput(scn, resources,"NAME");
                String login = getInput(scn, resources, "LOGIN");
                String password = getInput(scn, resources, "PSW");

                //  model.validate(login);

                model.addEntity(new Entity(login, name, password));

                //  break;
            } catch (EntityAlreadyExistException eaee) {
                viewer.output(eaee.getMessage());
            }



        }
        //  String surname = getInput(scn, resources, "SURNAME");
        /*
        String patronymic = getInput(scn,resources, "PATRONYMIC");
        String shortFullName = new StringBuilder().
                append(surname).
                append(' ').
                append(name.substring(0,1)).
                append('.').
                toString();
*/
/*
        NominalInformation nominalInformation = new NominalInformation(surname, name, login, patronymic);

        String city = getInput(scn, resources, "CITY");
        String street = getInput(scn, resources, "STREET");
        String building = getInput(scn, resources, "BUILDING");
        String flatNumber = getInput(scn, resources, "FLAT_NUMBER");
        String postcode = getInput(scn, resources, "POSTCODE");

        AddressInformation addressInformation = new AddressInformation(city, street, building, Integer.parseInt(flatNumber), Integer.parseInt(postcode));

        String homePhone = getInput(scn, resources, "HOME_PHONE");
        String mobilePhone = getInput(scn, resources, "MOBILE_PHONE");
        String optionalPhone = getInput(scn, resources,"OPTIONAL_PHONE");

        IRLInformation irlInformation = new IRLInformation(homePhone, mobilePhone, optionalPhone);

        String eMail = getInput(scn, resources, "EMAIL");
        String skype = getInput(scn, resources, "SKYPE");

        URLInformation urlInformation = new URLInformation(eMail, skype);
*/

    }

    @Deprecated
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
