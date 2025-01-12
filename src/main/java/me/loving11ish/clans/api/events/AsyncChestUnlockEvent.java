package me.loving11ish.clans.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncChestUnlockEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Location removedLockLocation;

    /**
     * Constructor for the AsyncChestUnlockEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param removedLockLocation location of the chest
     */
    public AsyncChestUnlockEvent(boolean isAsync, Player createdBy, Location removedLockLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.removedLockLocation = removedLockLocation;
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
     * Get the location of the unlocked chest
     * @return the chest location
     */
    public Location getRemovedLockLocation() {
        return removedLockLocation;
    }
}
