package th.ac.kmitl.atm;


import java.util.Map;

public class Bank {
    private String name; //attribute

    private Map<Integer,Customer> customers; //composition
    private DataSourceDB dataSource;         //composition

    public Bank(String name, DataSource dataSource) {
        this.name = name;
        this.dataSource = new DataSourceDB();
        this.customers = this.dataSource.readCustomer();
    }

    public void registerCustomer(Customer customer){
        customers.put(customer.getId(),customer);
    }

    public Customer findCustomer(int id){
        return customers.get(id);
    }

    public String getName() {
        return name;
    }
}
