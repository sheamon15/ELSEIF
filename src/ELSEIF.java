/**
 * @AUTHOR:SheaSalloum
 * @date:10/3/17
 * @license:GNU
 */
    import javafx.application.Application;
            import javafx.stage.Stage;// import statements for javafx
            import java.util.Optional;
            import javafx.scene.control.TextInputDialog;

public class ELSEIF extends Application{
    @Override
    public void start (Stage primayStage){
        TextInputDialog textinputdialog = new TextInputDialog("INFORMATION");// allows user to input
        textinputdialog.setTitle("println or printf");
        textinputdialog.setContentText("Select easy for println or hard for printf");
        Optional <String> input = textinputdialog.showAndWait();
        String option = input.get();

        if(option.equals("easy")){// displays the option for print ln
            System.out.println(" you have the first and easy print version call println");
        } else if(option.equals("hard")){// displays options for print f 
            System.out.printf(" you have chosen the hard option %s \n", "This is really hard");
            System.out.printf( " your Charachter is: %c \n",65);
            System.out.printf(" your Decimal %d \n",678973,3456);
            System.out.printf(" your Exponet is %1.2e \n" , 66.2);
            System.out.printf(" your float is %f \n" , 6.89);










        }

    }
}




