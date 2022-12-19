package ism.ase.ro.tests;

import ism.ase.ro.model.StatisticalException;
import ism.ase.ro.model.StatisticalValues;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StatisticalValuesTest3 {

    @Test(expected = StatisticalException.class)
    public void testGetAverageForEmptyList() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);

        double result = stistics.getAverage();
    }
}
