package com.mateus.Aletorio.proxy;

import com.mateus.Aletorio.init.MBlocks;
import com.mateus.Aletorio.init.MItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		MItems.registerRenders();
		MBlocks.registerRenders();
	}
	
}
