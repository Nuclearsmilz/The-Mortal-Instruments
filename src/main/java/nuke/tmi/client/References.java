package nuke.tmi.client;

import java.util.*;

import org.apache.logging.log4j.*;

import net.minecraft.block.*;
import net.minecraft.item.*;

public class References {

	public static final String MCVERSION = "1.11.2";

	public static final String MODID = "tmi";
	public static final String NAME = "The-Mortal-Instruments";
	public static final String VERSION = MCVERSION + "-" + "0.0.1";
	public static final String APIVERSION = MCVERSION + "-" + "1.0.0";
	//public static final String DEPENDENCIES = "required-after:guideapi;";
	public static final String DEPENDENCIES = "";
	public static final String ACCEPTEDMCVERSIONS = "[1.11.2]";

	public static final String CLIENT_PROXY_CLASS = "nuke.tmi.core.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nuke.tmi.core.ServerProxy";

	public static final Random RANDOM = new Random();
	public static final Logger LOGGER = LogManager.getLogger(NAME);

//	public enum DarknessItem {
//	
//		private final String regName;
//
//		public String getRegName() {
//			return regName;
//		}
//		
//		DarknessItem(String regName) {
//			this.regName = regName;
//		}
//
//		public Item returnItem() {
//			return TheMortalInstrumentsAPI.returnItem(getRegName());
//		}
//	}

//	public enum DarknessBlock {
//
//		private final String regName;
//
//		public String getRegName() {
//			return regName;
//		}
//		
//		DarknessBlock(String regName) {
//			this.regName = regName;
//		}
//
//		public Block returnBlock() {
//			return TheMortalInstrumentsAPI.returnBlock(getRegName());
//		}
//	}
}