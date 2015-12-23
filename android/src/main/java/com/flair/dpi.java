package com.flair;
import android.util.DisplayMetrics;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

/**
 *
 */
public class dpi implements FREFunction
{
	@Override
	public FREObject call( FREContext freContext, FREObject[] freObjects )
	{
		DisplayMetrics metrics = freContext.getActivity( ).getResources( ).getDisplayMetrics( );
		float xdpi = metrics.xdpi;
		float ydpi = metrics.ydpi;
		float dpi = ( xdpi + ydpi ) / 2;

		try
		{
			return FREObject.newObject( dpi );
		}
		catch( FREWrongThreadException e )
		{
			e.printStackTrace( );
		}

		return null;
	}
}
