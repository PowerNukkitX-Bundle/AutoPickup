package org.powernukkitx.autopickup;

import org.powernukkitx.Player;
import org.powernukkitx.event.EventHandler;
import org.powernukkitx.event.EventPriority;
import org.powernukkitx.event.Listener;
import org.powernukkitx.event.block.BlockBreakEvent;
import org.powernukkitx.plugin.PluginBase;
import org.powernukkitx.plugin.PluginManager;
import org.powernukkitx.plugin.annotation.EventListener;
import org.powernukkitx.plugin.annotation.PluginMeta;
import org.powernukkitx.permission.Permission;

@PluginMeta(
        name = "AutoPickup",
        version = "1.0.0",
        authors = {
                "Buddelbubi"
        },
        api = {
                "3.0.0"
        },
        description = "Automatically place mined blocks into inventory",
        website = "https://github.com/PowerNukkitX-Bundle/AutoPickup"
)
@EventListener
public class AutoPickup extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.addPermission(new Permission(
                "autopickup.item",
                "Automatically adds mined items to the player's inventory",
                Permission.DEFAULT_TRUE
        ));
        manager.addPermission(new Permission(
                "autopickup.xp",
                "Automatically adds experience from mined blocks to the player",
                Permission.DEFAULT_TRUE
        ));
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event) {
        if (!event.isCancelled()) {
            Player player = event.getPlayer();
            if (player.getGamemode() != Player.CREATIVE) {
                if (player.hasPermission("autopickup.item")) {
                    event.setDrops(player.getInventory().addItem(event.getDrops()));
                }
                if (player.hasPermission("autopickup.xp")) {
                    player.addExperience(event.getDropExp());
                }
            }
        }
    }

}
