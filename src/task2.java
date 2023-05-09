import java.util.*;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = pullArr(15);
        System.out.println(arr);
        System.out.printf("Макс %d\n",Collections.max(arr));
        System.out.printf("Мин %d\n",Collections.min(arr));
        System.out.printf("avg %.1f\n",getavg(arr));
    }

    static ArrayList<Integer> pullArr(int size) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int numb = rand.nextInt(size);
            arr.add(numb);
        }
        return arr;
    }
    static Double getavg(ArrayList <Integer> list){
        double sum=0;
        for(Iterator <Integer> iterator = list.iterator(); iterator.hasNext();){
            Integer numb = iterator.next();
            sum+=numb;
        }
        return sum/ list.size();
    }
}
