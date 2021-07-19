package az.uderent.junittest.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HesapMakinesiTest {
    // En Kucuk parcacigi(method) bele test etmeli
    // Sadece bir senaryo test edile bilir
    // Kullanilan addimlar Given When Then
    // Test method ismi test edilen senaryoyu yansitmali

    private HesapMakinesi hesapMakinesi;

    @BeforeAll
    public void init(){
        hesapMakinesi = new HesapMakinesi();
    }

    @Test
    public void testTopla(){
        // Given
        int a= 1;
        int b= 6;

        // When
        int topla = hesapMakinesi.topla(a, b);

        // Then
        Assertions.assertEquals(7,topla);
    }

    @Test
    public void testCikar(){
        int a = 16;
        int b = 7;

        int cikar = hesapMakinesi.cikar(a, b);

        Assertions.assertEquals(9,cikar);
    }


}
