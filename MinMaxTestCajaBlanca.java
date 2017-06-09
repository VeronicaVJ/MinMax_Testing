package Test;

import static org.junit.Assert.*;
import JunitMinMax.MinMax;
public class MinMaxTestCajaBlanca {
	
	int [] xs = null;
	int [] xs2 = {};
	int [] xs3 ={1}; 	
	int [] xs4 = {1,3,5,7,3,1};
	
	@org.junit.Test
	public void stamentCoverage(){
		MinMax.minMax(xs4);
	}
	@org.junit.Test
	public void decisionCoverage(){
		MinMax.minMax(xs);
		MinMax.minMax(xs4);
	}
	
	@org.junit.Test
	public void conditionCoverage(){
		MinMax.minMax(xs4);
		MinMax.minMax(xs3);
		MinMax.minMax(xs);
	}
	
	@org.junit.Test
	public void decisionConditionCoverage(){
		MinMax.minMax(xs);
		MinMax.minMax(xs2);
		MinMax.minMax(xs3);
		MinMax.minMax(xs4);
	}
	
	
	
	
	
}
