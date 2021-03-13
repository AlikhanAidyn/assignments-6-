package subtask2;

import java.util.Scanner;

public class LogisticsTest {

    private static Logistics logistics;

    public static void main(String[] args) {
        configuration();
        logisticcs();
    }

    static void configuration() {
        String a = "ship";
        switch (a) {
        case ("truck") -> logistics = new RoadLogistics();
        case ("ship") -> logistics = new SeaLogistics();
        }
    }

    static void logisticcs() {
        logistics.planDelivery();
    }
}
