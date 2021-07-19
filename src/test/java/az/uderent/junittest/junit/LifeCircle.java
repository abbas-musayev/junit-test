package az.uderent.junittest.junit;

import org.junit.jupiter.api.*;

public class LifeCircle {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All class method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All class mehtod");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each method");
    }

    @Test
    public void testHelloWorld(){
        System.out.println("Hello World");
    }

    @Test void testHello(){
        System.out.println("Hello");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Method");
    }
}
