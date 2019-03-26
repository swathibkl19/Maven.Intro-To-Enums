package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator  {

    String name="";

    public AliceBobEvaluator(String input) {
            this.name=input;
    }

    public boolean isAlice() {

        if(this.name == "Alice")
            return true;
        else
            return false;
    }

    public boolean isBob() {
        if(this.name == "Bob")
            return true;
        else
            return  false;
    }
}
