/*
 * Programmer Name- Jasleen Kaur
 * Date- 26 July,2020
 * Program- To calculate the cost of items selected by the user.
 */
package assignment4;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
 
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Assignment4Controller implements Initializable 
{

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt3;
    @FXML
    private TextField txt4;
    @FXML
    private CheckBox chk1;
    @FXML
    private CheckBox chk2;
    @FXML
    private CheckBox chk3;
    @FXML
    private CheckBox chk4;
    @FXML
    private TextArea textArea;
    
    /**
     * To calculate the total cost of items selected by the user.
     * @param event 
     */
    @FXML
    private void total(ActionEvent event)
    {
        textArea.setText("");
        double d=0;
        
        if(chk4.isSelected())
        {
            d=Double.parseDouble(txt4.getText());
        }

        if(chk1.isSelected()==true && chk2.isSelected()==true && chk3.isSelected()==true) 
        {
            Double a=Double.parseDouble(txt1.getText());
            Double b=Double.parseDouble(txt2.getText());
            Double c=Double.parseDouble(txt3.getText());
             double mouse=a*10;
             double USB=b*20;
             double charger=c*15;
             double discount=d;
            double total=((mouse)+(USB)+(charger))-discount;
            textArea.appendText("Cost of Mouse:: $"+mouse+"\n");
            textArea.appendText("Cost of USB:: $"+USB+"\n");
            textArea.appendText("Cost of Charger:: $"+charger+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
            
        }
        
        else if(chk1.isSelected()==true && chk2.isSelected()==true) 
        {
            Double a=Double.parseDouble(txt1.getText());
            Double b=Double.parseDouble(txt2.getText());
           
            double mouse=a*10;
            double USB=b*20;
            double discount=d;
            double total=((mouse)+(USB))-discount;
            textArea.appendText("Cost of Mouse:: $"+mouse+"\n");
            textArea.appendText("Cost of USB:: $"+USB+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
         }
        
        else if(chk1.isSelected()==true && chk3.isSelected()==true) 
        {
             Double a=Double.parseDouble(txt1.getText());
             Double c=Double.parseDouble(txt3.getText());
            
            double mouse=a*10;
            double charger=c*15;
            double discount=d;
            double total=((mouse)+(charger))-discount;
            textArea.appendText("Cost of Mouse:: $"+mouse+"\n");
            textArea.appendText("Cost of Charger:: $"+charger+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
        }
        
        else if(chk2.isSelected()==true && chk3.isSelected()==true) 
        {
             Double b=Double.parseDouble(txt2.getText());
            Double c=Double.parseDouble(txt3.getText());
          
             double USB=b*20;
             double charger=c*15;
             double discount=d;
            double total=((USB)+(charger))-discount;
            textArea.appendText("Cost of USB:: $"+USB+"\n");
            textArea.appendText("Cost of Charger:: $"+charger+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
        }
        else if(chk1.isSelected()==true) 
        {
            Double a=Double.parseDouble(txt1.getText());
            
            double mouse=a*10;
            double discount=d;
            double total=(mouse)-discount;
            textArea.appendText("Cost of Mouse:: $"+mouse+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
        }
        
        else if(chk2.isSelected()==true) 
        {
            Double b=Double.parseDouble(txt2.getText());
             
            double USB=b*20;
            double discount=d;
            double total=(USB)-discount;
            textArea.appendText("Cost of USB:: $"+USB+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
        }
        
        else if(chk3.isSelected()==true) 
        {
            Double c=Double.parseDouble(txt3.getText());
            
            double charger=c*15;
            double discount=d;
            double total=(charger)-discount;
            textArea.appendText("Cost of Charger:: $"+charger+"\n");
            textArea.appendText("Discount:: $"+discount+"\n");
            textArea.appendText("Total payment:: $"+total+"\n");
        }
    }
    /**
     * To enable the first checkbox
     * @param event 
     */
    
    @FXML
    private void chkFirst(ActionEvent event)
    {
        if(chk1.isSelected() == true)
        {
            txt1.setDisable(false);
        }
        else
        {
            txt1.setDisable(true);
        }
    }
     /**
     * To enable the second checkbox
     * @param event 
     */
      
    @FXML
    private void chkSecond(ActionEvent event)
    {
        if(chk2.isSelected()==true)
        {
            txt2.setDisable(false);
        }
        else
        {
           txt2.setDisable(true);
        }
    }
     /**
     * To enable the third checkbox
     * @param event 
     */
      
    @FXML
  private void chkThird(ActionEvent event)
    {
        if(chk3.isSelected()==true)
        {
            txt3.setDisable(false);
        }
        else
        {
           txt3.setDisable(true);
        }
    }
   /**
     * To enable the discount checkbox
     * @param event 
     */
  @FXML
 private void chkDiscount(ActionEvent event)
    {
        if(chk4.isSelected()==true)
        {
            txt4.setDisable(false);
        }
        else
        {
           txt4.setDisable(true);
        }
    }
  
    
     /**
     * To clear all the textboxes when clear button is clicked.
     * @param event 
     */
    @FXML
    private void clear(ActionEvent event) 
    {
        txt1.clear();
        txt2.clear();
        txt3.clear();
        txt4.clear();
    }
     /**
     * To exit from the screen when exit button is pressed.
     * @param event 
     */
    @FXML
     private void exit(ActionEvent event) 
    {
      Alert a=new Alert(Alert.AlertType.CONFIRMATION);
      a.setTitle("Exit message");
      a.setHeaderText("Confirmation");
      a.setContentText("press OK if you want to exit");
      a.showAndWait().ifPresent(response -> { 
        if(response == ButtonType.OK)
            {
                System.exit(0);
            }
         });      
    }
     /**
      * To disable all the checkboxes initially
      * @param url
      * @param rb 
      */
      @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        txt1.setDisable(true);
         txt2.setDisable(true); 
         txt3.setDisable(true);
         txt4.setDisable(true);
    }    
    
}
