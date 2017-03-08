package com.forestnewark;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField stringInput;
    public Label stringOutput;

    public void toUpperCase() {
        String upperCase = stringInput.getText().toUpperCase();
        stringOutput.setText(upperCase);
        stringOutput.setVisible(true);

    }

    public void reverseString() {
        String input = stringInput.getText();
        String reverse = "";
        for(int x = input.length(); x > 0 ; x--) {
            reverse = reverse + input.substring(x-1,x);
        }
        stringOutput.setText(reverse);
        stringOutput.setVisible(true);

    }

    public void toPigLatin() {
        String input = stringInput.getText();
        String[] splitString = input.split("\\s+");
        String output = "";
        for(String myString: splitString) {
            if (myString.substring(0,1).matches("[aeiouAIOU]")) {
                output = output + myString + "way ";
            }else if (!myString.substring(0,1).matches("[aeiouAIOU]") && !myString.substring(1,2).matches("[aeiouAIOU]")) {
                output = output + myString.substring(2,myString.length()) + myString.substring(0,2) + "ay " ;
            }else {
                output = output + myString.substring(1,myString.length()) + myString.substring(0,1) + "ay ";
            }
            stringOutput.setText(output);
            stringOutput.setVisible(true);
        }

    }

    public void removeVowels() {
        String input = stringInput.getText();
        String output = "";
        for (int x = 0;x < input.length();x++) {
            if(!input.substring(x,x+1).matches("[aeiouAIOU]")) {
                output = output + input.substring(x,x+1);
            }
        }
        stringOutput.setText(output);
        stringOutput.setVisible(true);
    }

    public void toLowerCase() {
        String upperCase = stringInput.getText().toLowerCase();
        stringOutput.setText(upperCase);
        stringOutput.setVisible(true);
    }

    public void close() {
        System.exit(0);
    }

    public void clear() {
        stringOutput.setText("");
        stringInput.setText("");
    }
}
