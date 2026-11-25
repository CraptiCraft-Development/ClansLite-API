package me.loving11ish.clans.api.events;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Fired when a chest owned by a clan is broken.
 */
public class AsyncChestBreakEvent extends Event {

    /** Registered handlers for this event. */
    private static final HandlerList HANDLERS = new HandlerList();
    /** Location of the broken chest. */
    private final Location chestLocation;
    /** Broken chest block. */
    private final Block block;
    /** UUID of the owning clan owner, represented as a string. */
    private final String owningClanOwnerUUID;
    /** Name of the owning clan. */
    private final String owningClanName;

    /**
     * Constructor for the AsyncChestBreakEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param chestLocation location of the chest
     * @param block block of the chest
     * @param owningClanOwnerUUID owner of the clan
     * @param owningClanName name of the clan
     */
    public AsyncChestBreakEvent(boolean isAsync, Location chestLocation, Block block, String owningClanOwnerUUID, String owningClanName) {
        super(isAsync);
        this.chestLocation = chestLocation;
        this.block = block;
        this.owningClanOwnerUUID = owningClanOwnerUUID;
        this.owningClanName = owningClanName;
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
     * Get the location of the chest
     * @return the chest location
     */
    public Location getChestLocation() {
        return chestLocation;
    }

    /**
     * Get the block of the chest
     * @return the block
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Get the owner of the clan
     * @return the owner of the clan(UUID as a string)
     */
    public String getOwningClanOwnerUUID() {
        return owningClanOwnerUUID;
    }

    /**
     * Get the name of the clan
     * @return the name of the clan
     */
    public String getOwningClanName() {
        return owningClanName;
    }
}
