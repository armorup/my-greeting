import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Column;
import zero.ui.TextField;

public class Main extends App {

    @Override
    public void settings() {
        padding(40);
    }

    @Override
    public void setup() {
        // Build your interface here.
        Label greeting = new Label("Hello, World!!!");

        TextField name = new TextField();
        name.setPromptText("Your name");

        Button button = new Button("Say hello");
        button.onClick(() ->
        greeting.setText("Hello, " + name.getText() + "!"));

        show(new Column(10, greeting, name, button));

    }

    public static void main(String[] args) {
        launch(args);
    }
}
