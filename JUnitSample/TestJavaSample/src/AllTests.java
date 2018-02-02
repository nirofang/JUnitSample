// Following libraries are used for test runner in eclipse
// Used with @RunWith, @SuiteClasses
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Following libraries are used for console output
// Need to use with static void main()
// Open debug view to get the javaw.exe command line from Run property
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RunWith(Suite.class)
@SuiteClasses({Leet002_Add_Two_Num_Test.class})
//Other @SuiteClasses({})

public class AllTests {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(Leet002_Add_Two_Num_Test.class);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests finished successfully...");
		}
	}
}
