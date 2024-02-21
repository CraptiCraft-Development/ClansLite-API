package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import me.loving11ish.clans.api.models.ClanChest;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AsyncChestLockEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan owningClan;
    private final ClanChest chest;
    private final Location chestLocation;

    public AsyncChestLockEvent(boolean isAsync, Player createdBy, Clan owningClan, ClanChest chest, Location chestLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.owningClan = owningClan;
        this.chest = chest;
        this.chestLocation = chestLocation;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public Player getCreatedBy() {
        return createdBy;
    }

    public Clan getOwningClan() {
        return owningClan;
    }

    public ClanChest getChest() {
        return chest;
    }

    public Location getChestLocation() {
        return chestLocation;
    }
}
