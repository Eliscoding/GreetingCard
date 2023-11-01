package assignement;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Elpidio_DogbeviCard extends Application {
	//elpidiobasile.dogbevi@students.fhnw.ch, 27.10.2023, Drawing Card Assignment
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
        // Create the Stage (the theater)
        primaryStage.setTitle("Greeting Card from Togo");
        
        Group root = new Group();
        Scene scene = new Scene (root, 600,600, Color.SKYBLUE);
        Stage stage = new Stage();
        
        //Requirements Title Text
        Text text = new Text();
        text.setText("Greetings from Lomé where I was born");
        text.setX(150);
        text.setY(50);
        text.setFont(Font.font("Satisfy", 20));
        text.setFill(Color.rgb(0,0,0));
        text.setTextAlignment(TextAlignment.CENTER);
        
        //Students email address requirement
        Text text1 = new Text();
        text1.setText("elpidiobasile.dogbevi@students.fhnw.ch");
        text1.setX(100);
        text1.setY(590);
        text1.setFont(Font.font("Satisfy", 20));
        text1.setFill(Color.rgb(0, 0, 0));
        text1.setTextAlignment(TextAlignment.CENTER);
        text.setOpacity(50);
        
        // Draw the sun
        Circle bottomButton = new Circle(0, 0, 150);
        bottomButton.setFill(Color.GOLD);
        
        // Draw the ground (beach)
        Rectangle ground = new Rectangle(0, 400, 600, 200);
        ground.setFill(Color.LIGHTGREY);
        Rectangle ground1 = new Rectangle(0, 400, 600, 100);
        ground1.setFill(Color.rgb(29,162,216));//ocean
        // Draw the streets (view on the beach)
        
        // draw trees around the road (on the right side)
		Ellipse tree = new Ellipse(585, 490, 10, 20);
		tree.setFill(Color.rgb(0, 128, 0));
		Ellipse tree1 = new Ellipse(550, 490, 10, 20);
		tree1.setFill(Color.rgb(0, 128, 0));
		Ellipse tree2 = new Ellipse(515, 490, 10, 20);
		tree2.setFill(Color.rgb(0, 128, 0));
		Ellipse tree7 = new Ellipse(425, 490, 10, 20);
		tree7.setFill(Color.rgb(0, 128, 0));
		Ellipse tree8 = new Ellipse(390, 490, 10, 20);
		tree8.setFill(Color.rgb(0, 128, 0));
		Ellipse tree9 = new Ellipse(360, 490, 10, 20);
		tree9.setFill(Color.rgb(0, 128, 0));
		Ellipse tree10 = new Ellipse(280, 490, 10, 20);
		tree10.setFill(Color.rgb(0, 128, 0));
		Ellipse tree11 = new Ellipse(250, 490, 10, 20);
		tree11.setFill(Color.rgb(0, 128, 0));
		Ellipse tree12 = new Ellipse(220, 490, 10, 20);
		tree12.setFill(Color.rgb(0, 128, 0));
		
        // draw trees around the road (on the left side)
		Ellipse tree4 = new Ellipse(65, 490, 10, 20);
		tree4.setFill(Color.rgb(0, 128, 0));
		Ellipse tree5 = new Ellipse(40, 490, 10, 20);
		tree5.setFill(Color.rgb(0, 128, 0));
		Ellipse tree6 = new Ellipse(15, 490, 10, 20);
		tree6.setFill(Color.rgb(0, 128, 0));
		
        // Draw stuff on the beach
        
        // draw a boat on the beach at same level as the sailing
      //Drawing a Rectangle 
        Rectangle rectangle = new Rectangle();  
        //Setting the properties of the rectangle 
        rectangle.setX(530.0f); 
        rectangle.setY(360.0f); 
        rectangle.setWidth(70.0f); 
        rectangle.setHeight(40.0f);
        rectangle.setFill(Color.rgb(61,133,198));
        //draw a second part of the boat
        Rectangle rectangle1 = new Rectangle();
      //Setting the properties of the rectangle 
        rectangle1.setFill(Color.rgb(255,0,0));
        Rectangle square = new Rectangle(000, 500, 600, 110);// (start x, start y, end x, end y)
        Rectangle square1 = new Rectangle(500, 350, 100, 10);
        square.setFill(Color.rgb(0, 128, 0));
              
         //Drawing an arc 
        Arc arc = new Arc();        
        arc.setCenterX(200.0f); 
        arc.setCenterY(400.0f); 
        arc.setRadiusX(90.0f); 
        arc.setRadiusY(90.0f); 
        arc.setStartAngle(90.0f); 
        arc.setLength(90.0f); 
        arc.setRotate(0);
        //Setting the type of the arc 
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.rgb(244,67,54));
        
        //Drawing Clouds
		Ellipse cloud = new Ellipse (250,100,150,20);
		cloud.setFill(Color.DEEPSKYBLUE);
		Ellipse cloud1 = new Ellipse (430,200,150,20);
		cloud1.setFill(Color.DEEPSKYBLUE);
		Ellipse cloud2 = new Ellipse (550,100,100,20);
		cloud2.setFill(Color.DEEPSKYBLUE);
		
	    Rectangle brim = new Rectangle(200, 395, 60, 5);
	    
	    //draw people swimming and on the beach
	    Circle head = new Circle (209, 460,50);
        Circle head1 = new Circle(217, 450, 3);
        Circle head2 = new Circle(145, 420, 3);
        Circle head3 = new Circle(485, 420, 3);
        Circle head4 = new Circle(490, 420, 3);
        Circle head5 = new Circle(350, 420, 3);
        Circle head6 = new Circle(117, 420, 2);
        Circle head7 = new Circle(135, 500, 10);//shelter coast left side
        head7.setFill(Color.rgb(0,255,255));
        Circle head8 = new Circle(125, 500, 10);//shelter on the coast left side
        Circle head11 = new Circle(150, 500, 10);//shelter on the left side
        head11.setFill(Color.rgb(173, 216, 230));
        head8.setFill(Color.rgb(255, 244, 155));
        Circle head9 = new Circle(330, 500, 10);//shelter on the middle
        head9.setFill(Color.rgb(173, 153, 93));
        Circle head10 = new Circle(320, 500, 10);//shelter on the middle
        head10.setFill(Color.rgb(170, 0, 0));
        Circle head12 = new Circle(450, 500, 10);//shelter on the right side
        head12.setFill(Color.rgb(96,221,142));
        Circle head13 = new Circle(460, 500, 10);//shelter on the right side
        head13.setFill(Color.rgb(173, 216, 230));
        Circle head14 = new Circle(470, 500, 10);//shelter on the right side
        head14.setFill(Color.rgb(234,112,112));
        Circle head15 = new Circle(480, 500, 10);//shelter on the right side
        head15.setFill(Color.rgb(12,90,0));
        
        //Draw a person jumping in ocean
      //Drawing Clouds
      		Ellipse body = new Ellipse (500,340,5,20);
      		body.setRotate(-99);
      		body.setFill(Color.rgb(0, 0, 0));
      		Ellipse body1 = new Ellipse (479,345,5,3);
      		body1.setFill(Color.rgb(0, 0, 0));
      		Ellipse body2 = new Ellipse (485,350,10,3);//arms
      		body2.setFill(Color.rgb(0, 0, 0));
      		body2.setRotate(130);
      		Ellipse body3 = new Ellipse (525,340,10,3);//Foot
      		body3.setFill(Color.rgb(0, 0, 0));
      		Ellipse body4 = new Ellipse (580,320,15,5);//Person standing behind belly
      		body4.setFill(Color.rgb(0, 0, 0));
      		body4.setRotate(90);
      		Ellipse body5 = new Ellipse (580,300,5,5);//Person standing behind head
      		body5.setFill(Color.rgb(0, 0, 0));
      		Ellipse body6 = new Ellipse (580,340,10,5);//Person standing behind foot
      		body6.setFill(Color.rgb(0, 0, 0));
      		body6.setRotate(90);
      		

        // Create the horizontal arc
        Arc horizontalArc = new Arc(200, 400, 30, 20, 180, 180);
        horizontalArc.setType(ArcType.OPEN);
        horizontalArc.setFill(Color.TRANSPARENT);
        horizontalArc.setStroke(Color.BLACK);
        horizontalArc.setStrokeWidth(3);
        
        root.getChildren().add(text);
        root.getChildren().add(ground);
        root.getChildren().add(bottomButton);
        root.getChildren().add(arc);
        root.getChildren().add(body);
        root.getChildren().add(body1);
        root.getChildren().add(body2);
        root.getChildren().add(body3);
        root.getChildren().add(body4);
        root.getChildren().add(body5);
        root.getChildren().add(body6);
        root.getChildren().add(horizontalArc);
        root.getChildren().add(cloud);
        root.getChildren().add(cloud1);
        root.getChildren().add(cloud2);
        root.getChildren().add(brim);
        root.getChildren().add(head);
        root.getChildren().add(ground1);
        root.getChildren().add(head1);
        root.getChildren().add(head2);
        root.getChildren().add(head3);
        root.getChildren().add(head4);
        root.getChildren().add(head5);
        root.getChildren().add(head6);
        root.getChildren().add(head7);
        root.getChildren().add(head8);
        root.getChildren().add(head9);
        root.getChildren().add(head10);
        root.getChildren().add(head11);
        root.getChildren().add(head12);
        root.getChildren().add(head13);
        root.getChildren().add(head14);
        root.getChildren().add(head15);
        root.getChildren().add(rectangle);
        root.getChildren().add(rectangle1);
        root.getChildren().add(square);
        root.getChildren().add(square1);
        root.getChildren().add(text1);
        root.getChildren().add(tree);
        root.getChildren().add(tree1);
        root.getChildren().add(tree2);
        root.getChildren().add(tree4);
        root.getChildren().add(tree5);
        root.getChildren().add(tree6);
        root.getChildren().add(tree7);
        root.getChildren().add(tree8);
        root.getChildren().add(tree9);
        root.getChildren().add(tree10);
        root.getChildren().add(tree11);
        root.getChildren().add(tree12);

        stage.setScene(scene);
        stage.setTitle("Greeting Card from Lomé ");
		stage.show();
		}
}