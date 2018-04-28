package presenter;

import view.IView;
import model.IModel;

public class Presenter implements IPresenter {

    IView view;
    IModel model;

    public Presenter(IView view, IModel model) {
        this.view = view;
        this.model = model;

    }

    @Override
    public void buttonPushed() {
        String textInput = view.getText();
        this.model.setText(textInput);

        String textOutput = this.model.getText();
        this.view.setText(textOutput);
    }
}
