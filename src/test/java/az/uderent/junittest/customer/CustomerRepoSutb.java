package az.uderent.junittest.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepoSutb extends CustomerRepo{

    private Map<Integer,Customer> customerMap = new HashMap<>();



    @Override
    public void saveCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerMap.remove(id);
    }

    @Override
    public Customer findById(int id) {
        Customer customer = customerMap.get(id);
        return customer;
    }

    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public void deleteEveryThing() {
        customerMap.clear();
    }
}
