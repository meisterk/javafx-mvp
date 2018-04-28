package model;

public class Model implements IModel {

    private String text;

    public Model() {
        this.text = "";
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
