package az.company.springbootq4.design_patterns.factory;

public class Postgres implements DB {

    @Override
    public void getConnection() {
        System.out.println("Connecting to postgres database...");
        System.out.println(".............In progress......");
        System.out.println("................In progress......");
        System.out.println("...................In progress......");
        System.out.println("......................In progress......");
        System.out.println(".........................In progress......");
        System.out.println("............................In progress......");
        System.out.println("Connected to postgres database.");
    }

    @Override
    public void getStatement() {
        System.out.println("Statement is ready !");
    }
}