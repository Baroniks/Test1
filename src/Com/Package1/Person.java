package Com.Package1;

public class Person {

    private static int count;
    public int health;

    public Person() {
        count++;
    }

    //static = принадлежность к классу или объекту. если статик есть, то принадлежит к классу, а если нет, то к объекту

    public static void getCount() {
        System.out.println("Кол - во  " + count);

    }
}
