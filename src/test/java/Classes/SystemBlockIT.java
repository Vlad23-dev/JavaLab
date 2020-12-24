package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class SystemBlockIT {
    private final String MODEL = "HyperX Fury Black";
    private final Producers PRODUCER = Producers.HyperX;
    private final float CAPACITY = 0.8F;
    private final String TYPE = "RAM";
    private final String TYPE_RAM = "DDR3";
    private final float FREQUENCY = 3200.0F;
    private final SystemBlock testBlock = new SystemBlock();

    SystemBlock testBlockMock = Mockito.mock(SystemBlock.class);
    SystemBlock testBlockSpy = Mockito.spy(testBlock);

    @Test
    public void getRAMsByTypeIT() throws HandleException.EmptyReturn {
        //GIVEN
        final List<RAM> listRAM = Collections.singletonList(
                new RAM(MODEL, PRODUCER, CAPACITY, TYPE, TYPE_RAM, FREQUENCY));

        Mockito.doReturn(listRAM).when(testBlockMock).getRAMsByType(TYPE_RAM);
        //WHEN
        final List<RAM> actual = testBlockMock.getRAMsByType(TYPE_RAM);
        //THEN
        Assertions.assertEquals(actual, listRAM);
    }

    @Test
    public void sumRAMFrequencyByTypeIT() {
        //GIVEN
        final List<RAM> listRAM = Collections.singletonList(
                new RAM(MODEL, PRODUCER, CAPACITY, TYPE, TYPE_RAM, FREQUENCY));

        Mockito.when(testBlockMock.sumRAMFrequencyByType(TYPE_RAM)).thenReturn((double)listRAM.get(0).getFrequency());
        //WHEN
        final double actual = testBlockMock.sumRAMFrequencyByType(TYPE_RAM);
        //THEN
        Mockito.verify(testBlockMock, Mockito.times(1)).sumRAMFrequencyByType(TYPE_RAM);
        Assertions.assertEquals(actual, listRAM.get(0).getFrequency());

    }

    @Test
    public void getMaxRAM_IT_whenValueIsIllegal() throws HandleException.EmptyReturn {
        //GIVEN
        testBlockSpy.setRAMs(new ArrayList<RAM>());
        final List<RAM> listRAM = Collections.singletonList(
                new RAM(MODEL, PRODUCER, CAPACITY, TYPE, TYPE_RAM, FREQUENCY));
        //WHEN
        final RAM actual = testBlockMock.getMaxRAM();
        //THEN
        Assertions.assertThrows(HandleException.EmptyReturn.class,
                () -> testBlockSpy.getMaxRAM());
    }

}
