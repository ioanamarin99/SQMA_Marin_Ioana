package ism.ase.ro.tests;

import ism.ase.ro.model.StatisticalException;
import ism.ase.ro.model.StatisticalValues;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StatisticalValuesTest2 {
    @Test
    public void getAverage() {
        List<Long> values = new ArrayList<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);

        double result = 0;
        try {
            result = stistics.getAverage();
        } catch (StatisticalException e) {
            fail(e.getMessage());
        }
        assertEquals("Average is not correct",2, result,0.01);
    }
}
