package exampleEnume.months;

public class PrintMonths {
    public void printMonths(){
        for (monthOfYear mon : monthOfYear.values()){
            mon.printMonths();
        }
    }
}
