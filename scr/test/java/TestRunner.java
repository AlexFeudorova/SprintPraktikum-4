import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Parametrized.OrderTest;
import Parametrized.QuestionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({QuestionTest.class, OrderTest.class})
public class TestRunner {
}
