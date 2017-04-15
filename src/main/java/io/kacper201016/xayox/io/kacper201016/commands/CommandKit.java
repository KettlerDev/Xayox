package io.kacper201016.xayox.io.kacper201016.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;



public class CommandKit implements CommandExecutor {

    private static ItemStack siekierka = new ItemStack(Material.STONE_AXE);
    private static ItemStack miecz = new ItemStack(Material.STONE_SWORD);
    private static ItemStack lopatka = new ItemStack(Material.STONE_SPADE);
    private static ItemStack drewno = new ItemStack(Material.WOOD, 60);

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("plugin.plugin")){
            sender.sendMessage("Nie masz permisji");
            return true;
        }
        if (sender instanceof Player) {
                    if (args.length == 1) {
                        if(args[0].equalsIgnoreCase("Gracz")) {
                            Player player = (Player)sender;
                            if (!KitUsageCooldown.canUse(player)) {
                                player.sendMessage("Nie minelo jeszcze 10 sekund");
                                return true;
                            }
                            player.getInventory().addItem(siekierka, miecz, lopatka, drewno);
                            KitUsageCooldown.times.put(player.getUniqueId(), System.currentTimeMillis() + 10 * 1000);
                            sender.sendMessage("Otrzymales zestaw "+args[0]);
                        }
                        if(args[0].equalsIgnoreCase("Vip")){
                            Player player = (Player) sender;
                            if (!KitUsageCooldown.canUse(player)){
                                player.sendMessage("Nie minelo jeszcze 60 sekund");
                                return true;
                            }
                            player.getInventory().addItem(siekierka, miecz, lopatka, drewno);
                            KitUsageCooldown.times.put(player.getUniqueId(), System.currentTimeMillis() + 10 * 1000);
                            sender.sendMessage(ChatColor.DARK_RED + "Otrzymales zestaw " + ChatColor.YELLOW +args[0]);
                        }

            }else{
                sender.sendMessage(ChatColor.DARK_AQUA + "Dostepne zestawy:" + ChatColor.YELLOW + " Gracz, Vip");
            }
        }else{
            sender.sendMessage("Nie jestes graczem");
        }
        return true;
    }
}
