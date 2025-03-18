import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import parametrized.OrderTest;
import parametrized.QuestionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({QuestionTest.class, OrderTest.class})
public class TestRunner {
}
