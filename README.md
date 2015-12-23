# flair-physical-density-ane
Adobe AIR native extension to retrieve android device physical density

Simple ane to retrieve physical density on android device since using as3 Capabilities.screenDpi will return bucket dpi (160, 240, 320, etc..).
This is useful if you need to do some measure on screen, for a ruler app for example.
This extension is actually used for flair-gradle-plugin (https://github.com/SamYStudiO/flair-gradle-plugin) to help convert inch values to dp values on android device.

```as3
trace( PhysicalDensity.dpi );
```

On desktop and iOS devices this will return Capabilities.screenDpi, so this extension has no isSupported method since it will works fine on all platform.
