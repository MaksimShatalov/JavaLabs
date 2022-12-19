import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();


        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(35);

        st2.push(40);
        st2.push(45);
        st2.push(50);
        st2.push(55);


        System.out.println("Перший стек до перестановки :"+ st1);
        System.out.println("Другий стек до перестановки :"+ st2);

        Iterator<Integer> i = st1.iterator();
        Iterator<Integer> i2 = st2.iterator();

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        st1.clear();

        for(int j =0;j<list2.size();j++) {
            st1.push(list2.get(j));
        }

        st2.clear();

        for(int j =0;j<list.size();j++) {
            st2.push(list.get(j));
        }


        System.out.println("Перший стек після перестановки : " +st1);
        System.out.println("Другий стек після перестановки : " +st2);


    }
}