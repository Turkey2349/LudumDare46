package com.theprogrammingturkey.ld46.game.action;

import com.theprogrammingturkey.ld46.entity.Plant;
import com.theprogrammingturkey.ld46.entity.Player;
import com.theprogrammingturkey.ld46.item.ItemStack;
import com.theprogrammingturkey.ld46.sounds.SoundManager;

public class ChopAction extends Action
{
	public ChopAction(Plant plant, Player player)
	{
		super("Chop", () ->
		{
			plant.remove();
			for(ItemStack drop : plant.getDrops())
				player.getInventory().addToInventory(drop);
			SoundManager.playSound(SoundManager.chop);
		});
	}
}
