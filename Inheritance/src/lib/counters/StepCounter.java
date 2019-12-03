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
	@Override
	public void increment() {
		for(int i = 0; i < step; i ++) {super.increment();}
	}

	@Override
	public void decrement() {
		for(int i = 0; i < step; i ++) {super.decrement();}
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "[Step = " + this.step + "]";
		
	}

}
