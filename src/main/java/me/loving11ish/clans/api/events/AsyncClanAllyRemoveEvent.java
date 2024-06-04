package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanAllyRemoveEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Player exAllyClanCreatedBy;
    private final Clan exAllyClan;

    /**
     * Constructor for the AsyncClanAllyRemoveEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that removed the ally
     * @param exAllyClanCreatedBy player who was removed from the ally
     * @param exAllyClan clan that was removed from the ally
     */
    public AsyncClanAllyRemoveEvent(boolean isAsync, Player createdBy, Clan clan, Player exAllyClanCreatedBy, Clan exAllyClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.exAllyClanCreatedBy = exAllyClanCreatedBy;
        this.exAllyClan = exAllyClan;
    }

    /**
     * Get the handlers for the event
     * @return the handlers
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Get the player that created the event
     * @return the player
     */
    public Player getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the clan that removed the ally
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the player that owns the removed ally clan
     * @return the player
     */
    public Player getExAllyClanCreatedBy() {
        return exAllyClanCreatedBy;
    }

    /**
     * Get the clan that was removed from the ally
     * @return the clan
     */
    public Clan getExAllyClan() {
        return exAllyClan;
    }
}
