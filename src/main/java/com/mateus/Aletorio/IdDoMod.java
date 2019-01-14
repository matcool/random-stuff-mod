package com.mateus.Aletorio;

public class IdDoMod {
	
	public static final String MOD_ID = "aletorio";
	public static final String NAME = "Aleatoriedades";
	public static final String VERSION = "1.0-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mateus.Aletorio.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mateus.Aletorio.proxy.ServerProxy";
	
	public static enum AletoItems {
		BATATACORTADA("batatacortada", "Batatacortada"),
		BATATACTOSTED("batatactosted", "Batatactosted"),
		PAPER_RED("paper_red", "Paper_red"),
		SACO("saco", "Saco"),
		CHOCO("choco", "Choco"),
		ALFACE("alface", "Alface"),
		BATATAFRITE("batatafrita", "Batata_frita"),
		TAISSA("taissa", "Queijo"),
		BURGER("burger", "Hamburguer"),
		VIOLAO("violao", "Violao");
		
		private String unlocalizedName;
		private String registryName;
		AletoItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
  
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	public String getRegistryName() {
		return registryName;
	   }	
	}
	public static enum AletoBlocks {
		CORTADOR("cortador", "Cortador"),
		LAMPA("lampa", "Lampa"),
		ALFACECROP("alfacecrop", "AlfaceCrops");
		
		private String registryName;
		private String unlocalizedName;
		AletoBlocks(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
  
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	public String getRegistryName() {
		return registryName;
	}
	}
}