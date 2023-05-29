package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 lab=new SILab2();

    @Test
    void EveryBranch(){
        RuntimeException ex;
        ex= assertThrows(RuntimeException.class,()->lab.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        List<User> users=new ArrayList<>();
        users.add(new User("Stefan","zcxv","Stefan@gmail.com"));
        users.add(new User("Petar","asdf","Petar@outlook.com"));
        assertFalse(lab.function(new User("Stefan", "zcxv", "Stefan@gmail.com"), users));

        assertFalse(lab.function(new User("Stefan", "makedo()nija", "Stefan"), users));

        assertFalse(lab.function(new User("Stefan", "makedonija", "Stefan"), users));

        assertFalse(lab.function(new User("Stefan", "makedo nija", "Stefan"), users));
    }
    @Test
    void MultipleConditions(){
        RuntimeException ex2;
        ex2= assertThrows(RuntimeException.class,()->lab.function(null,null));

        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));

        assertDoesNotThrow(()->lab.function(new User("aaaaaaa","bbbbbbb","ccccccc"),null));
    }
}