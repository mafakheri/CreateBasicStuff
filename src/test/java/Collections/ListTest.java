package Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

    @Test
    void array_list_method() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("dog");
        animals.add("rabbit");
        System.out.println(animals);

        LinkedList<String> student = new LinkedList<>();
        student.add("mohamad");
        student.add("arezo");
        student.add("narges");
        student.add("najmeh");
        System.out.println(student);


        Assertions.assertThat(student.size()).isEqualTo(4);
    }
}
