package lib.counters;

public class StepCounter extends Counter {
	private int step;

	//Default Constructor
	public StepCounter() {
		super();
		step = 1;
	}
	
	//Custom constructor
	public StepCounter(int count) {
		super(count);
		step = 1;
	}

	public StepCounter(int count, int step) {
		super(count);
		this.step = step;
	}
	//Getters and setters
	public int getStep() {
		return step;
	}


	public void setStep(int step) {
		this.step = step;
	}

	//Methods
	public void increment() {
		int count = this.getCount() + step;
		this.setCount(count);
	}
	
	public void decrement() {
		int count = this.getCount() - step;
		this.setCount(count);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + this.toString();
		
	}

}
