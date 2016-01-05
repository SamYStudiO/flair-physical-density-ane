package flair
{
	import flash.external.ExtensionContext;
	import flash.system.Capabilities;

	/**
	 *
	 */
	public class PhysicalDensity
	{
		/**
		 *
		 */
		private static var __instance : PhysicalDensity;

		/**
		 *
		 */
		public static function get version() : String
		{
			return "1.0.0";
		}

		/**
		 *
		 */
		public static function get dpi() : uint
		{
			return Capabilities.manufacturer.indexOf( "Android" ) >= 0 ? uint( __getInstance()._context.call( "dpi" ) ) : Capabilities.screenDPI;
		}

		/**
		 *
		 */
		private static function __getInstance() : PhysicalDensity
		{
			if( __instance == null ) __instance = new PhysicalDensity( new Singleton() );

			return __instance;
		}

		/**
		 *
		 */
		private var _context : ExtensionContext;

		/**
		 * @private
		 */
		public function PhysicalDensity( singleton : Singleton )
		{
			if( singleton == null ) throw new Error( this + " Singleton instance can only be accessed through getInstance method" );

			_context = ExtensionContext.createExtensionContext( "flair.PhysicalDensity" , "" );

			if( !_context )
			{
				throw new Error( "PhysicalDensity native extension is not supported on this platform." );
			}
		}
	}
}

class Singleton
{
}