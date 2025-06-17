public class WeeklyTemperature {
    
    public static void main(String[] args) {
        // Array to store 7 days' temperatures
        double[] temps = {25.5, 26.0, 24.8, 27.2, 23.9, 25.0, 26.5};

        // Print temperatures
        System.out.println("Weekly Temperatures:");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temps[i] + "°C");
        }
    }
}

