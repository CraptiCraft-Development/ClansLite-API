package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanHomeDeleteEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Location deletedHomeLocation;

    /**
     * Constructor for the AsyncClanHomeDeleteEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that the home belonged to
     * @param deletedHomeLocation location of the deleted home
     */
    public AsyncClanHomeDeleteEvent(boolean isAsync, Player createdBy, Clan clan, Location deletedHomeLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.deletedHomeLocation = deletedHomeLocation;
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
     * Get the clan that the home belonged to
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the location of the home that was deleted
     * @return the old home location
     */
    public Location getDeletedHomeLocation() {
        return deletedHomeLocation;
    }
}
