package az.uderent.junittest.customer;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServices {

    CustomerRepo customerRepo;

    InformationService informationService;

    public void save(Customer customer) {
        customerRepo.saveCustomer(customer);
    }

    public void sendMail(Customer customer){
        informationService.newResgisterSendMail(customer);
    }

    public void deleteCustomer(int id){
        customerRepo.deleteCustomer(id);
    }


    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void setInformationService(InformationService informationService) {
        this.informationService = informationService;
    }


}
