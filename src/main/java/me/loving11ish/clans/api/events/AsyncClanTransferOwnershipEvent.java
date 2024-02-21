package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AsyncClanTransferOwnershipEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Player originalClanOwner;
    private final Player newClanOwner;
    private final Clan newClan;

    public AsyncClanTransferOwnershipEvent(boolean isAsync, Player createdBy, Player originalClanOwner, Player newClanOwner, Clan newClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.originalClanOwner = originalClanOwner;
        this.newClanOwner = newClanOwner;
        this.newClan = newClan;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public Player getCreatedBy() {
        return createdBy;
    }

    public Player getOriginalClanOwner() {
        return originalClanOwner;
    }

    public Player getNewClanOwner() {
        return newClanOwner;
    }

    public Clan getNewClan() {
        return newClan;
    }
}
