package model;

public class Mensch {
    private String name;
    private boolean freund;

    public Mensch(String name, boolean freund) {
        this.name = name;
        this.freund = freund;
    }

    public boolean isFreund() {
        return freund;
    }

    public String getName() {
        return name;
    }

    public void setFreund(boolean freund) {
        this.freund = freund;
    }

    public void setName(String name) {
        this.name = name;
    }  
    
}
