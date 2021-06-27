package az.company.springbootq4.design_patterns.factory;

public class Main {

    public static void main(String[] args) {

        DB db = new Oracle();
        // a lot of code blocks
        db.getConnection();
        // a lot of code blocks
        db.getStatement();
        // a lot of code blocks
    }
}