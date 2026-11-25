package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Fired when a clan purchases an additional chest.
 */
public class AsyncChestBuyEvent extends Event {

    /** Registered handlers for this event. */
    private static final HandlerList HANDLERS = new HandlerList();
    /** Player who purchased the chest. */
    private final Player createdBy;
    /** Clan that purchased the chest. */
    private final Clan owningClan;
    /** Previous maximum number of chests allowed for the clan. */
    private final int oldClanMaxAllowedChests;
    /** New number of chest slots. */
    private final int newChestCount;

    /**
     * Constructor for the AsyncChestBuyEvent
     *
     * @param isAsync if the event is async (always true when triggered by ClansLite)
     * @param createdBy the player who created the event
     * @param owningClan the clan that is buying the chest
     * @param oldClanMaxAllowedChests the old max allowed chests for the clan
     * @param newChestCount the new chest count for the clan
     */
    public AsyncChestBuyEvent(boolean isAsync, Player createdBy, Clan owningClan, int oldClanMaxAllowedChests, int newChestCount) {
        super(isAsync);
        this.createdBy = createdBy;
        this.owningClan = owningClan;
        this.oldClanMaxAllowedChests = oldClanMaxAllowedChests;
        this.newChestCount = newChestCount;
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
     * Get the player who purchased the chest.
     * @return the player
     */
    public Player getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the clan that is buying the chest
     * @return the clan
     */
    public Clan getOwningClan() {
        return owningClan;
    }

    /**
     * Get the old max allowed chests for the clan
     * @return the old max allowed chests
     */
    public int getOldClanMaxAllowedChests() {
        return oldClanMaxAllowedChests;
    }

    /**
     * Get the new chest count for the clan
     * @return the new chest count
     */
    public int getNewChestCount() {
        return newChestCount;
    }
}
