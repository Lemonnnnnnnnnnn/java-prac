package Demo;

public class VariableParams {
	private String[] names;
	
	public String[] getNames() {
		return names;
	}
	
	public void setNames(String[] names) {
		this.names = names;
	}
	
	public void setNames2(String... names) { 
		this.names = names; 
	}
}
