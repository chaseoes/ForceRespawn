package com.chaseoes.forcerespawn.nms.vPre;

import com.chaseoes.forcerespawn.api.NMS;
import net.minecraft.server.Packet205ClientCommand;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSHandler implements NMS {

    @Override
    public void sendRespawnPacket(Player player) {
        Packet205ClientCommand packet = new Packet205ClientCommand();
        packet.a = 1;
        CraftPlayer craftPlayer = (CraftPlayer) player;
        craftPlayer.getHandle().netServerHandler.a(packet);
    }
}
