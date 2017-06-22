package nuke.tmi.core;

import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.launchwrapper.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.tmi.client.*;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.ACCEPTEDMCVERSIONS)

@Mod.EventBusSubscriber
public class TheMortalInstruments {

	@Instance(References.MODID)
	public static TheMortalInstruments instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		TheMortalInstruments.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		TheMortalInstruments.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		References.LOGGER.info("The Mortal Instruments has loaded!");
		TheMortalInstruments.proxy.postInit(e);
	}

	public static CreativeTabs darknessTab = new CreativeTabs("tmi") {
		@Override
		public String getTabLabel() {
			return "tmi";
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.GOLDEN_APPLE); // TODO: Replace with Stele
		}
	};

	public static String prependModID(String name) {
		return References.MODID + ":" + name;
	}

	public static String prependModIDCapacity(String name) {
		return References.MODID + ":" + name + "Capacity";
	}
}