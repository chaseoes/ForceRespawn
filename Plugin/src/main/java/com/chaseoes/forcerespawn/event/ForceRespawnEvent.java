package com.chaseoes.forcerespawn.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class ForceRespawnEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    private boolean forcedRespawn;

    public ForceRespawnEvent(Player who, boolean forced) {
        super(who);
        forcedRespawn = forced;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Gets if respawn will be forced.
     *
     * @return whether respawn will be forced
     */
    public boolean isForcedRespawn() {
        return forcedRespawn;
    }

    /**
     * Set whether to force respawn or not.
     *
     * @param forced whether to force respawn or not
     */
    public void setForcedRespawn(boolean forced) {
        this.forcedRespawn = forced;
    }
}
