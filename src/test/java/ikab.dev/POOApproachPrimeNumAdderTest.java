package ikab.dev;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class POOApproachPrimeNumAdderTest {

    @Test
    void sumPrimeNumbers() {
        int result = new POOApproachPrimeNumAdder().sumPrimeNumbersInFirst50Numbers();

        assertThat(result, is(328));
    }

    @Test
    void sumFirst50PrimeNumbers() {
        int result = new POOApproachPrimeNumAdder().sumFirst50PrimeNumbers();

        assertThat(result, is(5117));
    }

    @Test
    void isPrimeNumber() {
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(1), is(false));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(2), is(true));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(3), is(true));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(4), is(false));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(7), is(true));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(9), is(false));
        assertThat(new POOApproachPrimeNumAdder().isPrimeNumber(50), is(false));
    }

}