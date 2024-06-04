package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanAllyAddEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Player allyClanCreatedBy;
    private final Clan allyClan;

    /**
     * Constructor for the AsyncClanAllyAddEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that is adding an ally
     * @param allyClanCreatedBy player who created the ally clan
     * @param allyClan clan that is being added as an ally
     */
    public AsyncClanAllyAddEvent(boolean isAsync, Player createdBy, Clan clan, Player allyClanCreatedBy, Clan allyClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.allyClanCreatedBy = allyClanCreatedBy;
        this.allyClan = allyClan;
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
     * Get the player who created the event
     * @return the player
     */
    public Player getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the clan that is adding an ally
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the player who created the ally clan
     * @return the player
     */
    public Player getAllyClanCreatedBy() {
        return allyClanCreatedBy;
    }

    /**
     * Get the clan that is being added as an ally
     * @return the clan
     */
    public Clan getAllyClan() {
        return allyClan;
    }
}
