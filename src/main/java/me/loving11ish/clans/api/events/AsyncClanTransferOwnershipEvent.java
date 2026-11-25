package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Fired when clan ownership is transferred to another player.
 */
public class AsyncClanTransferOwnershipEvent extends Event {

    /** Registered handlers for this event. */
    private static final HandlerList HANDLERS = new HandlerList();
    /** Player who initiated the ownership transfer. */
    private final Player createdBy;
    /** Previous clan owner. */
    private final Player originalClanOwner;
    /** New clan owner. */
    private final Player newClanOwner;
    /** Clan whose ownership changed. */
    private final Clan newClan;

    /**
     * Constructor for the AsyncClanTransferOwnershipEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param originalClanOwner original owner of the clan
     * @param newClanOwner new owner of the clan
     * @param newClan new clan object
     */
    public AsyncClanTransferOwnershipEvent(boolean isAsync, Player createdBy, Player originalClanOwner, Player newClanOwner, Clan newClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.originalClanOwner = originalClanOwner;
        this.newClanOwner = newClanOwner;
        this.newClan = newClan;
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
     * Get the original owner of the clan
     * @return the player
     */
    public Player getOriginalClanOwner() {
        return originalClanOwner;
    }

    /**
     * Get the new owner of the clan
     * @return the player
     */
    public Player getNewClanOwner() {
        return newClanOwner;
    }

    /**
     * Get the new clan object
     * @return the clan
     */
    public Clan getNewClan() {
        return newClan;
    }
}
