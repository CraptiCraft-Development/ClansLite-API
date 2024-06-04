package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import me.loving11ish.clans.api.models.ClanChest;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncChestLockEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan owningClan;
    private final ClanChest chest;
    private final Location chestLocation;

    /**
     * Constructor for the AsyncChestLockEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param owningClan clan that owns the chest
     * @param chest the chest
     * @param chestLocation location of the chest
     */
    public AsyncChestLockEvent(boolean isAsync, Player createdBy, Clan owningClan, ClanChest chest, Location chestLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.owningClan = owningClan;
        this.chest = chest;
        this.chestLocation = chestLocation;
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
     * Get the clan that owns the chest
     * @return the clan
     */
    public Clan getOwningClan() {
        return owningClan;
    }

    /**
     * Get the chest object
     * @return the chest
     */
    public ClanChest getChest() {
        return chest;
    }

    /**
     * Get the location of the chest
     * @return the chest location
     */
    public Location getChestLocation() {
        return chestLocation;
    }
}
