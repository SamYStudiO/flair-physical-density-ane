package flair;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class PhysiclaDensityContext extends FREContext
{

	@Override
	public Map< String, FREFunction > getFunctions( )
	{
		Map< String, FREFunction > functions = new HashMap< String, FREFunction >( );

		functions.put( "dpi", new dpi( ) );

		return functions;
	}

	@Override
	public void dispose( )
	{

	}
}
