import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class StatisticalValuesTest1 {

    @Test
    public void getMinim() {
        List<Long> values = new ArrayList<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);
        long result = stistics.getMinim();

        assertEquals("Incorrect Minimum",1L, result);
    }
}