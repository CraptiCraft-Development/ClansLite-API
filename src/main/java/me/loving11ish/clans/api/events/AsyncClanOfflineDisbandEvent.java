package me.loving11ish.clans.api.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanOfflineDisbandEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final OfflinePlayer createdBy;
    private final String clanName;

    /**
     * Constructor for the AsyncClanOfflineDisbandEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy the player who created the event
     * @param clanName the name of the disbanded clan
     */
    public AsyncClanOfflineDisbandEvent(boolean isAsync, OfflinePlayer createdBy, String clanName) {
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
     * Get the handlers for the event
     * @return the handlers
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * Get the player who created the event
     * @return the player
     */
    public OfflinePlayer getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the name of the disbanded clan
     * @return the clan name
     */
    public String getClan() {
        return clanName;
    }
}
