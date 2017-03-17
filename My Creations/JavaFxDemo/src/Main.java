
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Button button;
	
	
    public static void main(String[] args) {
    	// This is a method within the Application class.
    	// Sets up the program as a JavaFX Application, then it calls the method called start.
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	
    	primaryStage.setTitle("This is JavaFx");
    	button = new Button();
    	button.setText("Click me");
    	button.setOnAction(this);

    	
    	StackPane layout = new StackPane();
    	layout.getChildren().addAll(button);
    	
    	Scene scene = new Scene(layout, 300, 250);
    	primaryStage.setScene(scene);
    	primaryStage.show();
    	primaryStage.setResizable(true);
    	
    	
    	
    }
    
    @Override 
    public void handle(ActionEvent event){
    	
    	// The boolean expression in the if statement figures out if the source of the ActionEvent is = to the button, then execute a function.
    	if(event.getSource() == button){
    		System.out.println("OOOooohhh I love it when you touch me there......");
    	}
    }
    
}