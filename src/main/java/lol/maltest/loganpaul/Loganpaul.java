package lol.maltest.loganpaul;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public final class Loganpaul extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("LoganPaul") &&
                sender instanceof Player) {
            Player player = (Player)sender;

                Collection<? extends Player> onlinePlayers = Bukkit.getOnlinePlayers();
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("Help me help you");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("Girl what you trying to do");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("'cause I don't got a clue");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("No, I ain't no Scooby Doo");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("(Help me help you)");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("cause I'm hungrier than you");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("I just wanna get some food and you about to kill my mood");
                }
            }, 0, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    for (Player p : onlinePlayers)
                        p.chat("(Help me help you)");
                }
            }, 0, 20L);
        }
        return true;
    }
}
