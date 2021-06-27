package az.company.springbootq4.design_patterns.facade;

public class Main {

    private static final FacadeService service = new FacadeServiceImpl();

    public static void main(String[] args) {
        service.getFacade();
    }
}
