package calcul;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculTest  {
	Calcul cal;
	@Before
	public void setup() {
		cal = new Calcul();
	}
		@Test
	public void testAddition() 
		{
			double a=5;
			double b=5;
			double res=a+b;
			
	assertTrue("a et b positifs",cal.addition(a,b)==res);
		
		 a=-5;
		 b=-5;
		 res=a+b;
		
	assertTrue("a et b negatifs",cal.addition(a,b)==res);
	
	a=-5;
	 b=5;
	 res=a+b;
	
assertTrue("a negatif et b positif ",cal.addition(a,b)==res);
	
    a=5;
    b=-5;
    res=a+b;

assertTrue("a positif et b negatif",cal.addition(a,b)==res);
  a=0;
  b=0;
  res=a+b;

assertTrue("a et b nuls",cal.addition(a,b)==res);
   
  a=0;
  b=5;
  res=a+b;

assertTrue("a nul et b positif ",cal.addition(a,b)==res);
  a=0;
  b=-5;
  res=a+b;

assertTrue("a nul et b negatif ",cal.addition(a,b)==res);
  a=5;
  b=0;
  res=a+b;

assertTrue("a positif et b nul ",cal.addition(a,b)==res);
  a=-5;
  b=0;
  res=a+b;

assertTrue("a negatif et b nul ",cal.addition(a,b)==res);

		}
		
		@Test
	public void testMultiplication() {
			double a=5;
			double b=5;
			double res=a*b;
			
	assertTrue("a et b positifs",cal.multiplication(a,b)==res);
		
		 a=-5;
		 b=-5;
		 res=a*b;
		
	assertTrue("a et b negatifs",cal.multiplication(a,b)==res);
	
	a=-5;
	 b=5;
	 res=a*b;
	
assertTrue("a negatif et b positif ",cal.multiplication(a,b)==res);
	
    a=5;
    b=-5;
    res=a*b;

assertTrue("a positif et b negatif",cal.multiplication(a,b)==res);
  a=0;
  b=0;
  res=a*b;

assertTrue("a et b nuls",cal.multiplication(a,b)==res);
   
  a=0;
  b=5;
  res=a*b;

assertTrue("a nul et b positif ",cal.multiplication(a,b)==res);
  a=0;
  b=-5;
  res=a*b;

assertTrue("a nul et b negatif ",cal.multiplication(a,b)==res);
  a=5;
  b=0;
  res=a*b;

assertTrue("a positif et b nul ",cal.multiplication(a,b)==res);
  a=-5;
  b=0;
  res=a*b;

assertTrue("a negatif et b nul ",cal.multiplication(a,b)==res);

		
	}

}
