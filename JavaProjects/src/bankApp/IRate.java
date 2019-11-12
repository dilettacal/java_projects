package bankApp;

public interface IRate {
	
	// Method that returns the base rate
	// Bench mark rate
	default double getBaseRate() {
		return 2.5;
	}

}
