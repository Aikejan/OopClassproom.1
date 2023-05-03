import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Programming programming = new Programming("Alina","Asanova",35);
        Programming programming1 = new Programming("Victor", "Andreev",40);


        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(programming.name + " \n" +programming.surName +"\n " + (2023-35)+" \n" +
                programming1.name +"\n" +programming1.surName + "\n" +(2023-40));

    }
}