package az.uderent.junittest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTest {

    @Test
    public void testAssertion(){
        Dummy dummy1 = new Dummy(7); //$Dummy@47eaca72
        Dummy dummy2 = new Dummy(7); //$Dummy@55141def

        Assertions.assertEquals(dummy1,dummy2);

        Dummy dummy3 = dummy2;
        Assertions.assertSame(dummy2,dummy3,"Each Object must be the same");

        dummy1 = null;
        Assertions.assertNull(dummy1);

        Assertions.assertNotNull(dummy2);

        Assertions.assertTrue(dummy1 == null);

        Assertions.assertFalse(dummy1.getId() <5);
    }

    public static class Dummy{
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            return this.id == ((Dummy) obj).getId();
        }
    }

}
