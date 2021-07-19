package az.uderent.junittest.customer;

public class CustomerRepo {

    public void saveCustomer(Customer customer){
        System.out.println("Customer save edildi");
    }

    public void deleteCustomer(int id){
        System.out.println("Id ("+id+") Deleted");
    }

    public Customer findById(int id){
        System.out.println("FindById");
        return null;
    }
}
