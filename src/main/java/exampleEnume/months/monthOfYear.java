package exampleEnume.months;


public enum  monthOfYear {
    January("Январь"),
    February("Февраль"),
    March("Март"),
    April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");

    private String newMonths;
    monthOfYear(String months) {
        this.newMonths = months;
    }

    public void printMonths(){
        System.out.println(newMonths);
    }
}
