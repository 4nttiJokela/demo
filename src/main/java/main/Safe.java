package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe (String pinCode) {
        this.pinCode = pinCode;
        this.safeFolder = new ArrayList <>();
    }

    public void changePin (String newPin) {
        this.pinCode = newPin;
    }

    public void addItem (String item) {
        safeFolder.add(item);
    }

    public ArrayList<String> listItems(String pin) {
        if (this.pinCode.equals(pin)) {
            return safeFolder;
        } else {
            return null;
        }
    }
}
