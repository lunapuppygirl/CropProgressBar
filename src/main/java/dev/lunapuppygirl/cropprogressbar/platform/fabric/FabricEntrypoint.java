package dev.lunapuppygirl.cropprogressbar.platform.fabric;

//? fabric {

import dev.lunapuppygirl.cropprogressbar.Mod;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		Mod.onInitialize();
		FabricEventSubscriber.registerEvents();
	}
}
//?}
