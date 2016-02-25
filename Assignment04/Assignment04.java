import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignment04 extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Assignment Nodes
		Rectangle assignments = new Rectangle(10, 30, 120, 20);
		assignments.setFill(Color.RED);
		Text assignmentsLabel = new Text("Assignments: 20%");
		VBox assignmentsVBox = new VBox(5, assignmentsLabel, assignments);
//		Quizzes Nodes
		Rectangle quizzes = new Rectangle(130, 40, 120, 10);
		quizzes.setFill(Color.BLUE);
		Text quizzesLabel = new Text("Quizzes: 10%");
		VBox quizzesVBox = new VBox(5, quizzesLabel, quizzes);
//		Quizzes Nodes
		Rectangle review = new Rectangle(250, 40, 120, 10);
		review.setFill(Color.PINK);
		Text reviewLabel = new Text("Review: 10%");
		VBox reviewVBox = new VBox(5, reviewLabel, review);
//		Midterms Nodes
		Rectangle midterms = new Rectangle(370, 10, 120, 40);
		midterms.setFill(Color.GREEN);
		Text midtermsLabel = new Text("Midterms: 40%");
		VBox midtermsVBox = new VBox(5, midtermsLabel, midterms);
//		Finals Nodes
		Rectangle finals = new Rectangle(490, 30, 120, 20);
		finals.setFill(Color.ORANGE);
		Text finalsLabel = new Text("Finals: 20%");
		VBox finalsVBox = new VBox(5, finalsLabel, finals);
//		Horizontal Node
		HBox barGraph = new HBox(10, assignmentsVBox, quizzesVBox, reviewVBox, midtermsVBox, finalsVBox);
		barGraph.setPadding(new Insets(10));
//		Scene
		Scene scene = new Scene(barGraph);
//		Displaying the scene on the stage
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		Pie Chart Stage
		Stage secondaryStage = new Stage();
//		Assignments Arc
		Arc assignmentsArc = new Arc(300, 300, 200, 200, 0, 72);
		assignmentsArc.setType(ArcType.ROUND);
		assignmentsArc.setFill(Color.RED);
		Text assignmentsLabelPie = new Text(450, 150,"Assignments: 20%");
		Group assignmentsGroup = new Group(assignmentsArc, assignmentsLabelPie);
//		Quizzes Arc
		Arc quizzesArc = new Arc(300, 300, 200, 200, 72, 36);
		quizzesArc.setType(ArcType.ROUND);
		quizzesArc.setFill(Color.BLUE);
		Text quizzesLabelPie = new Text(260, 90,"Quizzes: 10%");
		Group quizzesGroup = new Group(quizzesArc, quizzesLabelPie);
//		Review Arc
		Arc reviewArc = new Arc(300, 300, 200, 200, 108, 36);
		reviewArc.setType(ArcType.ROUND);
		reviewArc.setFill(Color.PINK);
		Text reviewLabelPie = new Text(75, 150,"Review: 10%");
		Group reviewGroup = new Group(reviewArc, reviewLabelPie);
//		Midterm Arc
		Arc midtermArc = new Arc(300, 300, 200, 200, 144, 144);
		midtermArc.setType(ArcType.ROUND);
		midtermArc.setFill(Color.GREEN);
		Text midtermLabelPie = new Text(75, 470,"Midterm: 40%");
		Group midtermGroup = new Group(midtermArc, midtermLabelPie);
//		Finals Arc
		Arc finalsArc = new Arc(300, 300, 200, 200, 288, 72);
		finalsArc.setType(ArcType.ROUND);
		finalsArc.setFill(Color.ORANGE);
		Text finalsLabelPie = new Text(450, 470,"Midterm: 40%");
		Group finalsGroup = new Group(finalsArc, finalsLabelPie);
//		Group of Pie Chart
		Group pieGroup = new Group(assignmentsGroup, quizzesGroup, reviewGroup, midtermGroup, finalsGroup);
//		Scene
		Scene pieChart = new Scene(pieGroup);
//		Display Stage
		secondaryStage.setScene(pieChart);
		secondaryStage.show();
		
	}
}
