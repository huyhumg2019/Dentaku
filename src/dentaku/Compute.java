package dentaku;

public class Compute {
	private double mem01;
	private double mem02;
	private String memStatus01;
	private String memStatus02;
	private String separationPresent;
	private String separation01;
	private String separation02;
	private String separationStatus01;
	private String separationStatus02;
	ComputeValues computeValues;
	public Compute() {
		computeValues = new ComputeValues();
	}
	public ComputeValues getComputeValues() {
		computeValues.mem01 = mem01;
		computeValues.mem02 = mem02;
		computeValues.memStatus01=memStatus01;
		computeValues.memStatus02= memStatus02;
		computeValues.separationPresent= separationPresent;
		computeValues.separation01 = separation01;
		computeValues.separation02 = separation02;
		computeValues.separationStatus01 = separationStatus01;
		computeValues.separationStatus02 = separationStatus02;
		return computeValues;
	}
	public void setComputeValues(ComputeValues inputValues) {
		mem01 = inputValues.mem01;
		mem02 = inputValues.mem02;
		memStatus01 = inputValues.memStatus01;
		memStatus02 = inputValues.memStatus02;
		separationPresent = inputValues.separationPresent;
		separation01 = inputValues.separation01;
		separation02 = inputValues.separation02;
		separationStatus01 = inputValues.separationStatus01;
		separationStatus02 = inputValues.separationStatus02;
	}
	public double runCompute() {
		double ans=0;
		switch (separation01) {
		case "+":
			ans = mem01+mem02;
			break;
		case "-":
			ans = mem01+mem02;
			break;
		case "*":
			ans = mem01+mem02;
			break;
		case "/":
			ans = mem01+mem02;
			break;

		default:
			
		}
		return ans;
		
	}
	
}
