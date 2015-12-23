package com.flair;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

/**
 *
 */
public class PhysicalDensity implements FREExtension
{
	@Override
	public void initialize( )
	{

	}

	@Override
	public FREContext createContext( String s )
	{
		return new PhysiclaDensityContext( );
	}

	@Override
	public void dispose( )
	{

	}
}
