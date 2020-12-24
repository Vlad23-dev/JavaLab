package Classes;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProducersTest {
    ProducersTest() {
    }

    @Test
    public void testInfoCountrysProducer() throws Exception {
        Assertions.assertEquals("Taiwan", Producers.ASUS.getProducerCountry());
    }

    @Test
    public void testGetingSimilarProducers() throws Exception {
        String result = Producers.Kingston.getSimilarProducers();
        Assertions.assertNotNull(result);
    }

    @Test
    public void testStringReturn() throws Exception {
        Assertions.assertEquals(String.class, Producers.ASUS.toString().getClass());
    }

    @Test
    public void testArrayReturn() throws Exception {
        ArrayList<String> listCountries = new ArrayList<>();
        listCountries.add("China");
        listCountries.add("Taiwan");
        listCountries.add("USA");
        Assertions.assertNotNull(Producers.ASUS.splitProducersCountry("China,Taiwan,USA"));
        Assertions.assertArrayEquals(new ArrayList[]{listCountries}, new ArrayList[]{Producers.ASUS.splitProducersCountry("China,Taiwan,USA")});
    }
}