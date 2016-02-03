package modul4_task3;

public class Distance {
    public void distancePoint(int x1, int y1, int x2, int y2){
        int a = x2 - x1;
        int b = y2 - y1;
        double distance =  Math.sqrt (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(distance);
    }
}
