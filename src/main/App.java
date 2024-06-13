package main;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage pStage)  {
       pStage.setTitle("MyStage");
       pStage.setHeight(800);
       pStage.setWidth(1000);
       pStage.setResizable(false);
       pStage.getIcons().add(new Image("assets/images/pic.jpg"));
       pStage.show();
    }
}
