import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = pullArr(15);
        System.out.println(arr);
        DelNumArr(arr);
        System.out.println(arr);

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
    static void DelNumArr(ArrayList<Integer> array){
        for (Iterator <Integer> iterator = array.iterator();iterator.hasNext();) {
            Integer numb = iterator.next();
            if(numb% 2 ==0){
                iterator.remove();
            }
        }
    }
}
