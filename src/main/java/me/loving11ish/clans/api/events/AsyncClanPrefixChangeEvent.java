package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanPrefixChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final String oldPrefix;
    private final String newPrefix;

    /**
     * Constructor for the AsyncClanPrefixChangeEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that the prefix is being changed for
     * @param oldPrefix old prefix of the clan
     * @param newPrefix new prefix of the clan (this contains any color codes too)
     */
    public AsyncClanPrefixChangeEvent(boolean isAsync, Player createdBy, Clan clan, String oldPrefix, String newPrefix) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.oldPrefix = oldPrefix;
        this.newPrefix = newPrefix;
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
     * Get the clan that the prefix is being changed for
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the old prefix of the clan
     * @return the old prefix
     */
    public String getOldPrefix() {
        return oldPrefix;
    }

    /**
     * Get the new prefix of the clan (this contains any color codes too)
     * @return the new prefix
     */
    public String getNewPrefix() {
        return newPrefix;
    }
}
