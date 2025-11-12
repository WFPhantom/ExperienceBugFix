package com.wfphantom.experiencebugfix.events;

import com.wfphantom.experiencebugfix.ExperienceBugFix;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@Mod(value = ExperienceBugFix.MODID)
public class ChangeDimension
{
	@SubscribeEvent
	public static void onChange(PlayerEvent.PlayerChangedDimensionEvent event)
	{
		Player ep = event.getEntity();
		if (ep instanceof ServerPlayer player) player.setExperienceLevels(player.experienceLevel);
	}
}