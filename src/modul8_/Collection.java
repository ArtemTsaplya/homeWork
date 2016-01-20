package modul8_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {



    public static void main(String[] args) {

        List <ListFlower> listFlower = new ArrayList<>();
        listFlower.add(new ListFlower("Роза", "Белый"));
        listFlower.add(new ListFlower("Астра", "Желтый"));
        listFlower.add(new ListFlower("Ромашка", "Белый"));
        listFlower.add(new ListFlower("Тюльпан", "Красный"));
        System.out.println("Flower list:");

        for (ListFlower f: listFlower) {
            System.out.println(f);
        }


        System.out.println("\n" + "File list:");
        List<ListFile> listFile = new ArrayList<>();
        listFile.add(new ListFile("Текстовый файл", 4));
        listFile.add(new ListFile("Аудио файл", 12));
        listFile.add(new ListFile("Файл изображение", 7));
        Iterator<ListFile> iterator = listFile.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n" + "Instrument list:");
        List<ListInstrument> listInstrument = new ArrayList<>();
        listInstrument.add(new ListInstrument("Гитара", 7599));
        listInstrument.add(new ListInstrument("Труба", 9700));
        listInstrument.add(new ListInstrument("Фортепиано", 30000));

        listInstrument.stream().forEach(i -> System.out.println(i));


 }

}
