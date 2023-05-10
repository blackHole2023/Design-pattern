package singletonPattern;


public class DatabaseTest {
    public void test(){
        Database db1 = Database.getInstance();
        db1.query();
        Database db2 = Database.getInstance();
        db2.query();
    }

    public static void main(String[] args) {
        DatabaseTest databaseTest = new DatabaseTest();
        databaseTest.test();

    }

}
