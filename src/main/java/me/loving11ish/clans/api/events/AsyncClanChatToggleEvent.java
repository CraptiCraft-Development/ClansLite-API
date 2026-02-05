package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanChatToggleEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final boolean toggledState;

    /**
     * Constructor for the AsyncClanChatToggleEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan of the player
     * @param toggledState the toggled state of the clan chat (true if enabled, false if disabled)
     */
    public AsyncClanChatToggleEvent(boolean isAsync, Player createdBy, Clan clan, boolean toggledState) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.toggledState = toggledState;
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
     * Get the clan of the player
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the toggled state of the clan chat
     * @return the toggled state
     */
    public boolean getToggledState() {
        return toggledState;
    }
}
