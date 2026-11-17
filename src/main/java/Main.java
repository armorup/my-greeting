import zero.ui.Label;
import zero.App;

public class Main extends App {
    @Override public void settings() { padding(20); }

    public void setup() {
        Label greeting = new Label("Hello, java!");
        show(greeting);
    }
    public static void main(String[] args) { launch(args); }
}
