package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AsyncChestBuyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan owningClan;
    private final int oldClanMaxAllowedChests;
    private final int newChestCount;

    public AsyncChestBuyEvent(boolean isAsync, Player createdBy, Clan owningClan, int oldClanMaxAllowedChests, int newChestCount) {
        super(isAsync);
        this.createdBy = createdBy;
        this.owningClan = owningClan;
        this.oldClanMaxAllowedChests = oldClanMaxAllowedChests;
        this.newChestCount = newChestCount;
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

    public int getOldClanMaxAllowedChests() {
        return oldClanMaxAllowedChests;
    }

    public int getNewChestCount() {
        return newChestCount;
    }
}
