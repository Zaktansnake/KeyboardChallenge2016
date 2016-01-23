import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.NativeInputEvent;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javafx.application.Application;
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
    private boolean counter = false;
    private static int[] safeWord;
    private static int safeCount;
    
    public static void main(String[] args) {
    	launch(args);
    }
    
    public void start(Stage primaryStage) throws NativeHookException {
    	GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(this);
        turnOffJNativeLogger();
        
        safeWord = new int[6];
    	safeWord[0] = 37;
        safeWord[1] = 46;
        safeWord[2] = 3;
        safeWord[3] = 11;
        safeWord[4] = 2;
        safeWord[5] = 7;
        safeCount = 0;
        
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

    private void turnOffJNativeLogger() {
		// TODO Auto-generated method stub
    	Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
	}
    
    @Override
    
    public void nativeKeyPressed(NativeKeyEvent arg0) {
    	int key = arg0.getKeyCode();
    	if(key == NativeKeyEvent.VC_BACKSPACE) {
    		System.out.println();
    	} else if (key == NativeKeyEvent.VC_DELETE && NativeInputEvent.getModifiersText(arg0.getModifiers()).equals("Ctrl")) {
    		Easy.process(NativeKeyEvent.VC_ESCAPE);

    		System.out.println("hello");
    	} else if(key == NativeKeyEvent.VC_K) {
    		if(safeCount == 0) {
    			if(safeWord[0] == key) {
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(key == NativeKeyEvent.VC_C) {
    		if(safeCount == 1) {
    			if(safeWord[1] == key) {
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(key == NativeKeyEvent.VC_2) {
    		if(safeCount == 2) {
    			if(safeWord[2] == key) {
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(key == NativeKeyEvent.VC_0) {
    		if(safeCount == 3) {
    			if(safeWord[3] == key) {
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(key == NativeKeyEvent.VC_1) {
    		if(safeCount == 4) {
    			if(safeWord[4] == key) {
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(key == NativeKeyEvent.VC_6) {
    		if(safeCount == 5) {
    			if(safeWord[5] == key) {
    				System.exit(0);
    				safeCount++;
    			}
    		} else {
    			safeCount = 0;
    		}
    	} else if(!counter) {
    		Mode.process(key);
            counter = true;
        } else {
        	counter = false;
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