package az.uderent.junittest.customer;

import org.springframework.beans.factory.annotation.Autowired;

public class InformationService implements CustomerRepo {


    @Override
    public Customer save(Customer customer) {
        System.out.println(customer+" save edildi");
    }
}
