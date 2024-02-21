package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AsyncClanAllyAddEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Player allyClanCreatedBy;
    private final Clan allyClan;

    public AsyncClanAllyAddEvent(boolean isAsync, Player createdBy, Clan clan, Player allyClanCreatedBy, Clan allyClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.allyClanCreatedBy = allyClanCreatedBy;
        this.allyClan = allyClan;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public Player getCreatedBy() {
        return createdBy;
    }

    public Clan getClan() {
        return clan;
    }

    public Player getAllyClanCreatedBy() {
        return allyClanCreatedBy;
    }

    public Clan getAllyClan() {
        return allyClan;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
