package me.loving11ish.clans.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanDisbandEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final String clanName;

    /**
     * Constructor for the AsyncClanDisbandEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clanName name of the clan
     */
    public AsyncClanDisbandEvent(boolean isAsync, Player createdBy, String clanName) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clanName = clanName;
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
     * Get the name of the clan that was disbanded
     * @return the clan name
     */
    public String getClan() {
        return clanName;
    }
}
