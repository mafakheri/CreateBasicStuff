package Collections.Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    @Test
    void practice_with_maps() {
        Map<String, Integer> mohamadGrade = new HashMap<>();
        mohamadGrade.put("Math", 17);
        mohamadGrade.put("FluidDynamic", 70);
        mohamadGrade.put("Statics", 11);
        mohamadGrade.put("Dynamic and Control", 0);

        Set<Map.Entry<String, Integer>> grades = mohamadGrade.entrySet();
        System.out.println("result for mohamad exam is:");
        for (Map.Entry<String, Integer> grade : grades) {
            String key = grade.getKey();
            Integer value = grade.getValue();
            System.out.println("\t\t" + "grade for " + key + " is " + value);
        }
    }
}
