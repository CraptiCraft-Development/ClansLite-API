package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.ClanPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanChatSpyToggledEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final ClanPlayer clanPlayer;
    private final boolean clanChatSpyState;

    /**
     * Constructor for the AsyncClanChatSpyToggledEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clanPlayer player who toggled the clan chat spy
     * @param clanChatSpyState state of the clan chat spy
     */
    public AsyncClanChatSpyToggledEvent(boolean isAsync, Player createdBy, ClanPlayer clanPlayer, boolean clanChatSpyState) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clanPlayer = clanPlayer;
        this.clanChatSpyState = clanChatSpyState;
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
    public Player getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the ClanPlayer who toggled the clan chat spy
     * @return the ClanPlayer object
     */
    public ClanPlayer getClanPlayer() {
        return clanPlayer;
    }

    /**
     * Get the state of the clan chat spy
     * @return the state
     */
    public boolean isClanChatSpyState() {
        return clanChatSpyState;
    }
}
