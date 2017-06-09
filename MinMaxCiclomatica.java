package Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import JunitMinMax.MinMax;
	public class MinMaxCiclomatica {
		int[] xs = { 6, 7, 8 };
		int[] xs2 = null;
		int[] xs3 = { 2,4,6,8,10};
		int[] xs4 = { 8, 7, 6 };
		int[] xs5 = { 1, 1 };


		@org.junit.Test
		public void c1() {
			MinMax.minMax(xs);
		}

		@org.junit.Test
		public void c2() {
			MinMax.minMax(xs5);
		}

		@org.junit.Test
		public void c3() {
			MinMax.minMax(xs4);
		}

		@org.junit.Test
		public void c4() {
			MinMax.minMax(xs);
		}

		@org.junit.Test
		public void c5() {
			MinMax.minMax(xs3);
		}
}
