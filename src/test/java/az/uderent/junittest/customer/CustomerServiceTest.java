package az.uderent.junittest.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CustomerServiceTest {

    private CustomerServices customerServices;
    private CustomerRepoSutb customerRepo = new CustomerRepoSutb();
    private InformationService informationService;

    @BeforeEach
    void setUp() {
        customerServices = new CustomerServices();
        informationService = Mockito.mock(InformationService.class);
        customerServices.setCustomerRepo(customerRepo);
        customerServices.setInformationService(informationService);
    }

    @AfterEach
    public void after(){
        customerRepo.deleteEveryThing();
    }

    @Test
    public void testSaveCustomer(){
        Customer customer = new Customer(11);
        // Musterini save edirik
        customerServices.save(customer);
        //Then we check whether it is saved in the WB
        Assertions.assertTrue(customerRepo.getCustomerMap().containsValue(customer));
        // We check whether the customer is searched by id
        Assertions.assertEquals(customer,customerRepo.findById(11));
        // We check whether the SaveCustomer method is called or not
//        Mockito.verify(customerRepo).saveCustomer(customer);
    }

    @Test
    public void testDeleteCustomer(){
        customerServices.save(new Customer(11));

        // Il once DB-de musterinin olub olmamasini yoxluyuruq
        Assertions.assertNotNull(customerRepo.findById(11));

        // daha sonra silirik
        customerServices.deleteCustomer(11);

        // ve sonra DB-da null olub olmamasini yoxluyuruq
        Assertions.assertNull(customerRepo.findById(11));

    }

    @Test
    public void testInformationSend(){
        Customer customer = new Customer(11);
        customerServices.sendMail(customer);
        Mockito.verify(informationService).newResgisterSendMail(customer);
    }

}
