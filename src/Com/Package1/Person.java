package Com.Package1;

public class Person {

    private static int count;
    public int health;

    public Person() {
        count++;
    }

    //static = �������������� � ������ ��� �������. ���� ������ ����, �� ����������� � ������, � ���� ���, �� � �������

    public static void getCount() {
        System.out.println("��� - ��  " + count);

    }
}
