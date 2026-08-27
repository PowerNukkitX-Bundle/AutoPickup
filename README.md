# AutoPickup

AutoPickup is a simple plugin for [PowerNukkitX](https://github.com/PowerNukkitX/PowerNukkitX).

When a player breaks a block, the dropped items are placed directly into their
inventory and the experience is given to them automatically. Items that do not
fit into the inventory are dropped normally.

## Installation

1. Download the AutoPickup plugin file (`AutoPickup.jar`).
2. Put the file into the `plugins` folder of your PowerNukkitX server.
3. Restart the server.

No configuration is required.

## Permissions

Both permissions are enabled for all players by default:

- `autopickup.item`: Places mined items directly into the inventory.
- `autopickup.xp`: Gives experience from mined blocks directly to the player.

You can disable either feature for individual players or groups with your
preferred permissions plugin.

## Notes

- Creative mode is not affected.
