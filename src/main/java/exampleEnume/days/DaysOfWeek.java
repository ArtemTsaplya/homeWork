package exampleEnume.days;

public enum DaysOfWeek {
    SUNDAY("Неділя"),
    MONDAY("Понедельник"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четверг"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота");

    private String namePrint;
    DaysOfWeek(String dayName) {
        this.namePrint = dayName;
    }
    public void printDay(){
        System.out.println(namePrint);
    }
}

