import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import  java.util.Set;

public class Main {
    public static void main(String[] args) {

        StackLinkedList<Object> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push("This is a test");
        stack.push(true);
        stack.displayStack();



        /*
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }


        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("123");
        HashMap<String, Double> grades = new HashMap<String, Double>();
        grades.put("Ali",35.0);
        System.out.println(grades);
        grades.put("Pelin",90.0);
        System.out.println(grades);
        grades.put("Enes",10.0);
        System.out.println(grades);
        grades.put("Ali",60.0);
        System.out.println(grades);
        System.out.println(grades.keySet() instanceof Set);
         */


    }
}