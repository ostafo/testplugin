package com.github.ostafo.testplugin;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TestPluginListener implements Listener{ // Create Listener class with this

	@EventHandler // Import the event handler
	public void onBlockPlace(BlockPlaceEvent event){ // Creates var, create arg with object, import
		Player p = event.getPlayer();
		Block bp = event.getBlockPlaced();
		
		p.sendMessage("You have place a " + bp.getType().toString());
	}
}
