import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignment05 extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception{
//		Creating the Circle
		Circle circle = new Circle(100, 60, 50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
//		Creating MouseListener
		MouseListener mouseListener = new MouseListener();
//		Creating Text Field for message near cursor
		Text text = new Text(10, 10, " ");
//		Creating Pane
		Pane pane = new Pane(text, circle);
		pane.setPadding(new Insets(50, 100, 50, 100));
//		Creating Scene
		Scene scene = new Scene(pane);
//		Setting the scene
		primaryStage.setScene(scene);
		primaryStage.show();
//		Calling for actions based on mouse
		scene.setOnMouseMoved(mouseListener);
	}

	class MouseListener implements EventHandler<MouseEvent>{

		@Override
		public void handle(MouseEvent event) {
			double x = event.getX();
			double y = event.getY();
			if (MouseEvent.MOUSE_MOVED != null){
				if ((x >= 50 && x <= 150) && (y >= 10 && y <= 110)){
					text.setText("Mouse point is inside the circle");
				}
				else {
					text.setText("Mouse point is outside the circle");
				}
			}

		}

	}

}
