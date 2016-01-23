import java.awt.AWTException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.NativeInputEvent;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application implements NativeKeyListener {
	
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
        final Text challengeDescription1 = new Text();
        final Text challengeDescription2 = new Text();
        final Text challengeDescription3 = new Text();
        
        challengeDescription1.setText("Welcome to Keyboard Challenge 2016!");
        challengeDescription2.setText("Do you dare challenge your very knowledge of keyboards?!");
        challengeDescription3.setText("Choose your doom... I mean challenge difficulty!");
        
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
        rootGroup.getChildren().addAll(challengeDescription1, challengeDescription2, challengeDescription3, inputGridPane);
        rootGroup.setPadding(new Insets(12, 12, 12, 12));
        
        Scene scene = new Scene(rootGroup);
        return scene;
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent arg0) {
  	    // Enable user to start typing whenever the application is open
  	    if (isVisible) {
  	      Platform.runLater(new Runnable() {
  	        @Override
  	        public void run() {
  	          setFocusAtCommandBar();
  	        }
  	      });
  	    }

  	    boolean isCtrlSpacePressed =
  	        arg0.getKeyCode() == NativeKeyEvent.VC_SPACE
  	            && NativeInputEvent.getModifiersText(arg0.getModifiers()).equals("Ctrl");
  	
  	    boolean isCtrlHPressed =
  	        arg0.getKeyCode() == NativeKeyEvent.VC_H
  	            && NativeInputEvent.getModifiersText(arg0.getModifiers()).equals("Ctrl");
  	    
  	    if (isCtrlSpacePressed && isVisible) { // for hide feature: to hide the program
  	      hide(stage);
  	      try {
  	        tray.add(trayIcon);
  	      } catch (AWTException e) {
  	        System.out.println("TrayIcon could not be added.");
  	      }
  	      isVisible = false;
  	    } else if (isCtrlSpacePressed) { // for hide feature: to bring up the program
  	      Platform.runLater(new Runnable() {
  	        @Override
  	        public void run() {
  	          stage.show();
  	          tray.remove(trayIcon);
  	        }
  	      });
  	      isVisible = true;
  	    } else if(isCtrlHPressed && !isHelpOn) { // for help feature: to bring up the help menu
  	    	isHelpOn = true;
  	    	Platform.runLater(new Runnable() {
  	            @Override
  	            public void run() {
  	            	helpStage.show();
  	            }
  	          });
  	    } else if(isCtrlHPressed && isHelpOn) { // for help feature: to hide the help menu
  	    	isHelpOn = false;
  	    	hide(helpStage);
  	    }
    }

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}