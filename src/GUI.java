import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
	
	private static final String BUTTON_PROLEVEL = "Prepared to be mind blown!";
    private static final String BUTTON_HARDLEVEL = "I got this!";
    private static final String BUTTON_EASYLEVEL = "I'm a n00b!";
    private static final String SCENE_TITLE = "KeyBoard Challenge 2016";

    private Stage stage;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	stage = primaryStage;
	    Scene scene = chooseDifficultyScene(primaryStage);
	    primaryStage.setTitle(SCENE_TITLE);
	    primaryStage.setScene(scene);
	    primaryStage.show();
    }
    
    /**
     * Loads up the screen where user has to choose the difficulty of the challenge.
     * 
     * @param primaryStage
     *            The stage that will be used to display the SmarTask UI
     */
    private Scene chooseDifficultyScene(Stage primaryStage) {
        final Button proLevelButton = new Button(BUTTON_PROLEVEL);
        final Button hardLevelButton = new Button(BUTTON_HARDLEVEL);
        final Button easyLevelButton = new Button(BUTTON_EASYLEVEL);
        
        proLevelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent e) {

            }
        });
        
        hardLevelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent e) {

            }
        });
        
        easyLevelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent e) {

            }
        });
        
        final GridPane inputGridPane = new GridPane();
        GridPane.setConstraints(proLevelButton, 0, 0);
        GridPane.setConstraints(hardLevelButton, 1, 0);
        GridPane.setConstraints(easyLevelButton, 2, 0);
        inputGridPane.setHgap(6);
        inputGridPane.setVgap(6);
        inputGridPane.getChildren().addAll(proLevelButton, hardLevelButton, easyLevelButton);
        
        final Pane rootGroup = new VBox(12);
        rootGroup.getChildren().addAll(inputGridPane);
        rootGroup.setPadding(new Insets(12, 12, 12, 12));
        
        Scene scene = new Scene(rootGroup);
        return scene;
    }
}