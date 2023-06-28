package powerpackage;
import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert (new powerpackage.PowerFinder().getPower(1,1))==1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert ( new powerpackage.PowerFinder().getPower(2,1)) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert ( new powerpackage.PowerFinder().getPower(2,2)) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert ( new powerpackage.PowerFinder().getPower(3,2)) == 9;;
    }
}
