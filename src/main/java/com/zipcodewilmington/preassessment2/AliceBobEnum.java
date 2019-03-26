package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

   //String name ="";

    public String getCatchPhrase() {
        return "Hey, my name is " + name() + "!";
    }

    public boolean isAlice() {

        return name().equals(ALICE.name());
    }

    public boolean isBob() {
        return name().equals(BOB.name());
    }
}
