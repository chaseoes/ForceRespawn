package com.chaseoes.forcerespawn.nms.v1_4_6;

import com.chaseoes.forcerespawn.api.NMS;
import net.minecraft.server.v1_4_6.Packet205ClientCommand;
import org.bukkit.craftbukkit.v1_4_6.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSHandler implements NMS {

    @Override
    public void sendRespawnPacket(Player player) {
        Packet205ClientCommand packet = new Packet205ClientCommand();
        packet.a = 1;
        CraftPlayer craftPlayer = (CraftPlayer) player;
        craftPlayer.getHandle().playerConnection.a(packet);
    }
}
