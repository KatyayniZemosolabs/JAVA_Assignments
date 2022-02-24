package katyayni.assignment.main;

import katyayni.assignment.data.data;
import katyayni.assignment.singleton.singleton;

public class Main {
    public static void main (String[] args) {
        data obj = new data();
        obj.ToPrint();

        singleton single = singleton.getObj("Katyayni Tripathi");
        single.printName();

    }
}
