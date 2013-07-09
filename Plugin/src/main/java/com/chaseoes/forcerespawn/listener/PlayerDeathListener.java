package com.chaseoes.forcerespawn.listener;

import com.chaseoes.forcerespawn.ForceRespawn;
import com.chaseoes.forcerespawn.task.RespawnTask;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private final ForceRespawn plugin;

    public PlayerDeathListener(ForceRespawn plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        new RespawnTask(event.getEntity(), plugin).execute();
    }
}
