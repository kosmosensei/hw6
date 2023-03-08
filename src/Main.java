import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int[] n1 = new int [3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = i+1;
            System.out.println(n1[i]);
        }
        double[] n2 = {1.57, 7.654, 9.986};
        System.out.println(n2[0]);
        System.out.println(n2[1]);
        System.out.println(n2[2]);

        int[] n3 = new int [4];
        for (int i = 0; i < n3.length; i++) {
            n3[i] = (int) (Math.random() * 10);
            System.out.println(n3[i]);
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int[] n1 = new int [3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = i+1;
            if(i<n1.length-1) {
                System.out.print(n1[i] +",");
            } else {
                System.out.println(n1[i]);
            }
        }
        double[] n2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < n2.length; i++) {
            if(i<n2.length-1) {
                System.out.print(n2[i] +",");
            } else {
                System.out.println(n2[i]);
            }
        }
        int[] n3 = new int [4];
        for (int i = 0; i < n3.length; i++) {
            n3[i] = (int) (Math.random() * 10);
            if(i<n3.length-1) {
                System.out.print(n3[i] +",");
            } else {
                System.out.println(n3[i]);
            }
        }
    }public static void task3(){
        System.out.println("Задача 3");
        int[] n1 = new int [3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = n1.length - i;
            if(i<n1.length-1) {
                System.out.print(n1[i] +",");
            } else {
                System.out.println(n1[i]);
            }
        }
        double[] n2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < n2.length; i++) {
            if(i<n2.length-1) {
                System.out.print(n2[(n2.length-1)-i] +",");
            } else {
                System.out.println(n2[(n2.length-1)-i]);
            }
        }
        // кто мог знать, что на до будет записывать в рандомном поряке. Взял новую последвовательность.
        String[] n3 = {"a","b","c","d"};
        for (int i = 0; i < n3.length; i++) {
            if(i<n3.length-1) {
                System.out.print(n3[(n3.length-1)-i] +",");
            } else {
                System.out.println(n3[(n3.length-1)-i]);
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] n1 = new int[3];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = i + 1;
            if(n1[i]%2 !=0){
                n1[i]++;
            }
        }
        System.out.println(Arrays.toString(n1));
    }
}