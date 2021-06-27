package az.company.springbootq4.design_patterns.factory;

public class Oracle implements DB {

    @Override
    public void getConnection() {
        System.out.println("Connecting to oracle database...");
        System.out.println(".............In progress......");
        System.out.println("................In progress......");
        System.out.println("...................In progress......");
        System.out.println("......................In progress......");
        System.out.println(".........................In progress......");
        System.out.println("............................In progress......");
        System.out.println("Connected to oracle database.");
    }

    @Override
    public void getStatement() {
        System.out.println(" Oracle Statement is ready !");
    }

}
