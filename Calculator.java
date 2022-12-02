
				public class Calculator {
			double x,y,sum,diff,product,quotient,remainder;
			void setValues(int x,int y)
			{
				this.x=x;
				this.y=y;
			}
			void getsum()
			{
				sum=x+y;
				System.out.println("sum of two num :"+sum);
			}
			void getdiffrence()
			{
				diff=x-y;
				System.out.println("difference of two num :"+diff);
			}
			void getproduct()
			{
				product=x*y;
				System.out.println("product of two num :"+product);
			}
			void getquotient()
			{
				quotient=x/y;
				System.out.println("division of two num :"+quotient);
			}
			void getremainder()
			{
				remainder=x%y;
				System.out.println("remainder of two num :"+remainder);
			}

			public static void main(String[] args) {
				
				Calculator c=new Calculator();
				c.setValues(50, 5);
				c.getsum();
				c.getdiffrence();
				c.getproduct();
				c.getquotient();
				c.getremainder();
				

			}

		
	}


