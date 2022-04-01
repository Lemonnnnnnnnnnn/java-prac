package Demo;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		VariableParams v1 = new VariableParams();
		VariableParams v2 = new VariableParams();
		v1.setNames(new String[] {"XIAO MING" , "XIAO HUANG"});
		v2.setNames2("XIAO ZHANG","XIAO LI");
		System.out.println(Arrays.toString(v1.getNames()) );
		System.out.println(Arrays.toString(v2.getNames()) );
	}
}
