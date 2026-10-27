package dev.lunapuppygirl.cropprogressbar;

import dev.lunapuppygirl.cropprogressbar.platform.Platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? fabric {
import dev.lunapuppygirl.cropprogressbar.platform.fabric.FabricPlatform;
//?} neoforge {
/*import dev.lunapuppygirl.cropprogressbar.platform.neoforge.NeoforgePlatform;
 *///?}

@SuppressWarnings("LoggingSimilarMessage")
public class Mod {

	public static final String MOD_ID = /*$ mod_id*/ "cropprogressbar";
	public static final String MOD_VERSION = /*$ mod_version*/ "1.3.0";
	public static final String MOD_FRIENDLY_NAME = /*$ mod_name*/ "Crop Progress Bar";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Platform PLATFORM = createPlatformInstance();

	public static void onInitialize() {

	}

	public static void onInitializeClient() {

	}

	public static Platform xplat() {
		return PLATFORM;
	}

	private static Platform createPlatformInstance() {
		//? fabric {
		return new FabricPlatform();
		//?} neoforge {
		/*return new NeoforgePlatform();
		 *///?}
	}
}
