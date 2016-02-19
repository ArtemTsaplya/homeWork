package modul4_task3;

public class Distance {
    private double distance;

    public double distancePoint(int x1, int y1, int x2, int y2) {
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}
