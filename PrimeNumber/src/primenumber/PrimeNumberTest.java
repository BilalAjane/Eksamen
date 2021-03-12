package primenumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    //Initialize
    PrimeNumber primeNumber;
    @BeforeEach
    void setUp() {
        //Arrange
        //Instantiate
        primeNumber = new PrimeNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void prime() {
        //Act
        int result = primeNumber.prime(3);

        //Assert
        assertEquals(result,primeNumber.prime(3));
    }

    @Test
    void factor() {

        //Act
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(13);

        //Assert
        assertEquals(expected,primeNumber.factor(117));

    }
}