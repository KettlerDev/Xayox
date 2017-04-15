package io.kacper201016.xayox.io.kacper201016.commands;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class KitUsageCooldown {

    public static Map<UUID, Long> times = new ConcurrentHashMap<>();

    public static boolean canUse(Player player) {
        long time = times.containsKey(player.getUniqueId()) ? times.get(player.getUniqueId()) : -1;
        // czekaj jeszcze raz xD exacly Xd
        return time == -1 || time < System.currentTimeMillis();

    }

}
