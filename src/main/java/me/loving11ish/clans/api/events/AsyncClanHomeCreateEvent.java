package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanHomeCreateEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Location homeLocation;

    /**
     * Constructor for the AsyncClanHomeCreateEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that the home belongs to
     * @param homeLocation location of the home
     */
    public AsyncClanHomeCreateEvent(boolean isAsync, Player createdBy, Clan clan, Location homeLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.homeLocation = homeLocation;
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
     * Get the clan that the home belongs to
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the location of the home
     * @return the home location
     */
    public Location getHomeLocation() {
        return homeLocation;
    }
}
