package dev.lunapuppygirl.cropprogressbar.platform.fabric;

//? fabric {

import dev.lunapuppygirl.cropprogressbar.Mod;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		Mod.onInitializeClient();
	}

}
//?}
