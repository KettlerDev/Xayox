package io.kacper201016.xayox;

import io.kacper201016.xayox.io.kacper201016.commands.CommandKit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    Logger logger = getLogger();

    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "==========["+ ChatColor.BLUE + "Xayox" + ChatColor.GREEN + "]==========");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Status:" + ChatColor.RED + " " + ChatColor.GREEN + "ON");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Autor:" + ChatColor.RED + " " + "Kettler");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wersja:" + ChatColor.RED + " " + "1.0");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wersja minecraft:" + ChatColor.RED + " " + "1.11.2");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "==========["+ ChatColor.BLUE + "Xayox" + ChatColor.GREEN + "]==========");
        this.getCommand("kit").setExecutor(new CommandKit());

    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "==========[" + ChatColor.BLUE + "Xayox" + ChatColor.GREEN + "]==========");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Status:" + ChatColor.RED + " " + ChatColor.GREEN + "ON");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Autor:" + ChatColor.RED + " " + "Kettler");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Wersja:" + ChatColor.RED + " " + "1.0");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "==========[" + ChatColor.BLUE + "Xayox" + ChatColor.GREEN + "]==========");
    }
}
