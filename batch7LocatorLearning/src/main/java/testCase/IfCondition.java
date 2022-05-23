package testCase;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int width = 0;
		int length = 0;
		int height = 0;
		int biggestDimension=0;
		
		
		if (width>length) 
		{
			biggestDimension = width;
			
			if(height>width) 
			{
				biggestDimension = height;
			}
			
		} else {
			
			biggestDimension=length;
			if (height>length) 
			{
				biggestDimension=height;
			}
		}

	}

}
