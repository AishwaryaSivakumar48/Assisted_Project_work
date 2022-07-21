package KeywordsAndCustomExceptions;

public class throw_demo {

    {

        int a=45,b=0,div;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                div = a / b;
                System.out.print("\n\tThe result is : " + div);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");

		
	}

}
