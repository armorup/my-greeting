import zero.App;
import zero.ui.Label;

public class Main extends App {
    @Override public void settings() { padding(20); }

    @Override public void setup() {
        // Build your interface here.
        Label greeting = new Label("Hello, World!!!");
show(greeting);
    }

    public static void main(String[] args) { launch(args); }
}
