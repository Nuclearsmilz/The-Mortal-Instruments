package nuke.tmi.core;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		//Content.init();
		//Recipes.init();
	}

	public void init(FMLInitializationEvent e) {
		// TERegistry.registerTEs();
	}

	public void postInit(FMLPostInitializationEvent e) {
		//NetworkRegistry.INSTANCE.registerGuiHandler(TheMortalInstruments.instance, new GuiHandler());
	}

}