package org.powernukkitx.autoinventory;

import org.powernukkitx.plugin.PluginBase;
import org.powernukkitx.plugin.annotation.PluginMeta;

@PluginMeta(
        name = "AutoInventory",
        version = "1.0.0",
        authors = {
                "Buddelbubi"
        },
        api = {
                "3.0.0"
        },
        website = "https://github.com/PowerNukkitX-Bundle/AutoInventory"
)
public class AutoInventory extends PluginBase {

    private static AutoInventory INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    public static AutoInventory get() {
        return INSTANCE;
    }
}