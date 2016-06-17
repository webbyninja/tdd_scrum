package rpn;

import junit.framework.TestCase;

public class TestRPN extends TestCase {

    public void testcase1(){

        String values = "1,2,3,+,-";
        RPNcalc rpn = new RPNcalc();
        try {
			assertEquals(-4, rpn.calculate(values));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void testcase2(){

        String values = "6,2,*,3,/";
        RPNcalc rpn = new RPNcalc();
        try {
			assertEquals(4, rpn.calculate(values));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    public void testcase3(){

        String values = "2,3,^,4,5,+,+";
        RPNcalc rpn = new RPNcalc();
        try {
			assertEquals(17, rpn.calculate(values));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    public void testcase4(){

        String values = "50,%,2";
        RPNcalc rpn = new RPNcalc();
        try {
			assertEquals(1, rpn.calculate(values));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void testcase5(){

        String values = "2,2,+,2";
        RPNcalc rpn = new RPNcalc();
        try {
			assertEquals(17, rpn.calculate(values));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
