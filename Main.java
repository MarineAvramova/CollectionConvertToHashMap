import java.util.*;

public class Main {
    public static void main(String[] args){
    /*Create a class called Month with a "name" attribute (which will store the name of the month
 of the year). Add 11 Month objects (each with a different attribute) to an ArrayList,
except for the object with the "August" attribute. Then, it performs the insertion in
 the place that corresponds to that month and shows that the ArrayList maintains the correct order.
Convert the ArrayList from the previous exercise into a HashSet and make sure it
doesn't allow duplicates. Iterate through the list with a for and an iterator.*/

        ArrayList<Month> listOfMonth = new ArrayList<Month>();
        listOfMonth.add(new Month("January"));
        listOfMonth.add(new Month("February"));
        listOfMonth.add(new Month("March"));
        listOfMonth.add(new Month("April"));
        listOfMonth.add(new Month("May"));
        listOfMonth.add(new Month("June"));
        listOfMonth.add(new Month("July"));
        listOfMonth.add(new Month("September"));
        listOfMonth.add(new Month("October"));
        listOfMonth.add(new Month("November"));
        listOfMonth.add(new Month("December"));

        System.out.println(listOfMonth.size() + " - this is a size of ArrayList");

        System.out.println("The order of month before adding August ");
        for(int i = 0; i < listOfMonth.size(); i++) {
            System.out.println(i + " " + listOfMonth.get(i).getNameOfMonth());
        }

        System.out.println();
        System.out.println("The order of month after adding August ");
        listOfMonth.add(7, new Month("August"));
        for(int i = 0; i < listOfMonth.size(); i++) {
            System.out.println(i + " " + listOfMonth.get(i).getNameOfMonth());
        }

//        HashSet<Month> hashSetMonth = new HashSet<>();
//        hashSetMonth.addAll(listOfMonth);
//        System.out.println("Itertion  HashSet in for loop: ");
//        for(Month month: hashSetMonth){
//            System.out.println(month.getNameOfMonth());
//        }
//        Iterator<Month> iterator = hashSetMonth.iterator();
//        while(iterator.hasNext()){
//            Month month = iterator.next();
//            System.out.println("Using Iterator ");
//            System.out.println(month.getNameOfMonth());
//        }
        //HashSets do not maintain any order.
        Set<Month> hashSetMonth = new HashSet<>();
        for (Month month : listOfMonth) {
            hashSetMonth.add(month);
            System.out.println(month.getNameOfMonth());
        }

    }
}