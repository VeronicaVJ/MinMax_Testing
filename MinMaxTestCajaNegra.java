package Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import JunitMinMax.MinMax;

public class MinMaxTestCajaNegra {
	private int [] xs;
	
	 @After
	    public void tearDown() {
	        xs = null;
	    }
	 
	 @org.junit.Test
	 public void TestArrayNulo(){
		 xs=null;
		 assertArrayEquals("El resultado debe ser nulo.",null, MinMax.minMax(xs));
	 }
	 
	 @org.junit.Test
	 public void TestArrayResultadoCorrectoMinMax(){
		int [] array = {2,4,6,8,10};
		int [] res = {2,10};
		assertArrayEquals("Mayor y el menor valor contenido en el array.",res,MinMax.minMax(array));
	 }
	 
	 @org.junit.Test
	 public void TestArrayVacío(){ 
		 xs = new int [4];
		 int [] res = {0,0,0,0};
		 assertArrayEquals(MinMax.minMax(res), MinMax.minMax(xs));
	 }
	 @org.junit.Test
	 public void TestArrayConUnElemento(){
		 int [] array= {2};
		 int [] res = {2,2};
		 assertArrayEquals("Mínimo y máximo son el mismo valor.",res,MinMax.minMax(array));
		 
	 }
	 @org.junit.Test
	 public void TestArrayConDosElementosIguales(){
		 int [] array = {2,2};
		 int [] res = {2,2};
		 assertArrayEquals("Mínimo y máximo son el mismo valor.",res,MinMax.minMax(array));
		 
	 }		
}
