package view;

import presenter.Presenter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.IModel;
import model.Model;
import presenter.IPresenter;

public class View implements Initializable, IView {

    //---------------------------------------------
    // membervariables for gui-controls
    //---------------------------------------------
    @FXML
    private TextField textFieldInput;
    @FXML
    private Button buttonPush;
    @FXML
    private Label labelOutput;

    //---------------------------------------------
    // membervariables for mvp
    //---------------------------------------------
    private IPresenter presenter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // eventhandler
        //---------------------------------------------
        buttonPush.setOnAction(evt -> {
            presenter.buttonPushed();
        });

        //---------------------------------------------
        // start
        //---------------------------------------------
        IModel model = new Model();
        presenter = new Presenter(this, model);
    }

    //---------------------------------------------
    // methods from IView
    //---------------------------------------------
    @Override
    public String getText() {
        return textFieldInput.getText();
    }

    @Override
    public void setText(String text) {
        labelOutput.setText(text);
    }
}
