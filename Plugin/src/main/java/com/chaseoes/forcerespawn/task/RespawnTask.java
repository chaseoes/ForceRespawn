package com.chaseoes.forcerespawn.task;

import com.chaseoes.forcerespawn.ForceRespawn;
import com.chaseoes.forcerespawn.event.ForceRespawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class RespawnTask extends BukkitRunnable {

    private final Player player;
    private final ForceRespawn plugin;

    public RespawnTask(Player player, ForceRespawn plugin) {
        this.player = player;
        this.plugin = plugin;
    }

    @Override
    public void run() {
        ForceRespawnEvent fre = new ForceRespawnEvent(player, plugin.getPlayerForceRespawn(player));
        Bukkit.getPluginManager().callEvent(fre);
        if (fre.isForcedRespawn() && player.isOnline()) {
            plugin.sendRespawnPacket(player);
        }
    }

    public void execute() {
        runTask(plugin);
    }
}
