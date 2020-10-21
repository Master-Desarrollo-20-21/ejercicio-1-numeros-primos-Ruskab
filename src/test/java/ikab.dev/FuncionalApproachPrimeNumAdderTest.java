package ikab.dev;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class FuncionalApproachPrimeNumAdderTest {

    @Test
    void sumPrimeNumbers() {
        int result = new FuncionalApproachPrimeNumAdder().sumPrimeNumbersInFirst50Numbers();

        assertThat(result, is(328));
    }

    @Test
    void sumFirst50PrimeNumbers() {
        int result = new FuncionalApproachPrimeNumAdder().sumFirst50PrimeNumbers();

        assertThat(result, is(5117));
    }

    @Test
    void isPrimeNumber() {
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(1), is(false));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(2), is(true));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(3), is(true));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(4), is(false));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(7), is(true));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(9), is(false));
        assertThat(new FuncionalApproachPrimeNumAdder().isPrimeNumber(50), is(false));
    }


}