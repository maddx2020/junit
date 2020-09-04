package junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class CalculatorRunner extends BlockJUnit4ClassRunner {
	
	private CalculatorTestListener ctl;
	
	 public CalculatorRunner(Class<CalculatorTestListener> listener) throws InitializationError {
	        super(listener);
	        ctl = new CalculatorTestListener();
	    }
	 
	     public void run(final RunNotifier notifier) {
	         notifier.addListener(ctl);
	         super.run(notifier);
	     }

}
