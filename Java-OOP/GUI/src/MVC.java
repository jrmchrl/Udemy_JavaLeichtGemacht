import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class View {


Model m;

Button calculateButton;
Button resetButton;
ComboBox operatorBox;
 

TextField firstNumberField; 
TextField secondNumberField; 
TextField resultField; 
 

public double getFirstNumberField() { 
return Double.parseDouble(firstNumberField.getText()); 
} 
public double getSecondNumberField() { 
return Double.parseDouble(secondNumberField.getText()); 
} 
public char getOperatorBox() { 
return (char) operatorBox.getValue(); 
} 
 

void show() { 
this.secondNumberField.setText(String.valueOf(m.getFirstNumber())); 
this.firstNumberField.setText(String.valueOf(m.getSecondNumber())); 
this.resultField.setText(String.valueOf(m.getResult())); 
}

View(Stage primaryStage, Model model)  { 
 

m = model; 
 

BorderPane root = new BorderPane(); 
FlowPane topRow = new FlowPane(); 
FlowPane bottomRow = new FlowPane(); 
 

firstNumberField = new TextField("0"); 
secondNumberField = new TextField("0"); 
resultField = new TextField(); 
resultField.setEditable(false); 
 

Label equalsLabel = new Label("="); 
 

operatorBox = new ComboBox(); 
operatorBox.getItems().addAll('+', '-', '*', '/'); 
// '+'  show at startup 
operatorBox.getSelectionModel().select(0); 
 

calculateButton = new Button("Calculate!"); 
resetButton = new Button(„Clear"); 
 

topRow.setAlignment(Pos.CENTER); 
bottomRow.setAlignment(Pos.CENTER); 
 

topRow.getChildren().addAll(firstNumberField,operatorBox, 
secondNumberField, equalsLabel, resultField); 
bottomRow.getChildren().addAll(calculateButton, resetButton); 
 

root.setTop(topRow); 
root.setBottom(bottomRow); 
 

Scene scene = new Scene(root); 
primaryStage.setScene(scene); 
primaryStage.sizeToScene(); 
primaryStage.setTitle("Calculator"); 
primaryStage.show();

}
}