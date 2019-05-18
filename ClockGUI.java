package clocks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class ClockGUI extends Application
{
    //Declare GUI components.
	GridPane pane;
	Button showButton;
	TextField hoursTF;
	TextField minutesTF;
	TextField secondsTF;
	
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void createGUIComponents()
    {
       //Instantiate GUI Components and build GUI
    	pane = new GridPane();
    	hoursTF = new TextField();
    	minutesTF = new TextField();
    	secondsTF = new TextField();
    	hoursTF.setEditable(false);
    	minutesTF.setEditable(false);
    	secondsTF.setEditable(false);
    	pane.add(new Label("Hours"), 0, 0);
    	pane.add(hoursTF, 1,0);
    	pane.add(new Label("Minutes"), 0, 1);
    	pane.add(minutesTF, 1, 1);
    	pane.add(new Label("Seconds"), 0, 2);
    	pane.add(secondsTF, 1, 2);
    	showButton = new Button("Show Time");
    	pane.add(showButton, 1, 3);
        
    }
    public void attachHandlers()
    {
        showButton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
            	Clock ck = new Clock();
               hoursTF.setText(""+ck.getHour());
               minutesTF.setText(""+ck.getMinute());
               secondsTF.setText(""+ck.getSecond());
            }
            
        });
    }
    public void start(Stage stage) {
        createGUIComponents();
        attachHandlers();

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Clocks View");
        stage.setWidth(250);
        stage.setHeight(150);
        stage.show();
    }
}
