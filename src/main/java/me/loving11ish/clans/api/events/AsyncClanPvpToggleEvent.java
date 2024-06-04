package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanPvpToggleEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final boolean pvpToggleState;

    /**
     * Constructor for the AsyncClanPvpToggleEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that the pvp was toggled for
     * @param pvpToggleState the state of the pvp toggle
     */
    public AsyncClanPvpToggleEvent(boolean isAsync, Player createdBy, Clan clan, boolean pvpToggleState) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.pvpToggleState = pvpToggleState;
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
     * Get the clan that the pvp was toggled for
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the state of the pvp toggle
     * @return the state
     */
    public boolean isPvpToggleState() {
        return pvpToggleState;
    }
}
