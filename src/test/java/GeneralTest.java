import org.junit.Test;
import ua.axiom.Controller;
import ua.axiom.Model;
import ua.axiom.Viewer;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GeneralTest {

    @Test(timeout = 400)
    @Deprecated //  StringBufferInputStream doesn't work correctly with ukrainian characters
    public void generalUkrLocaleTest() {
        InputStream inputStream = new StringBufferInputStream("Тарас\nasdfer253\nasdfer253\n");
        ResourceBundle resources = ResourceBundle.getBundle("textbook_ua");
        Viewer viewer = new Viewer(resources);
        Model model = new Model();

        new Controller(model, viewer, resources).run(new Scanner(inputStream));

    }

    @Test(timeout = 400)
    public void generalEngLocaleTest() {
        InputStream inputStream = new StringBufferInputStream("Jhhon66\nasdfer253\n");
        ResourceBundle resources = ResourceBundle.getBundle("textbook_en");
        Viewer viewer = new Viewer(resources);
        Model model = new Model();

        new Controller(model, viewer, resources).run(new Scanner(inputStream));

    }
}
