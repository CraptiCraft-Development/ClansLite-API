package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanHomeTeleportEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Location homeLocation;
    private final Location tpFromLocation;

    /**
     * Constructor for the AsyncClanHomeTeleportEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan of the event
     * @param homeLocation location of the clan home
     * @param tpFromLocation location of the player before teleport
     */
    public AsyncClanHomeTeleportEvent(boolean isAsync, Player createdBy, Clan clan, Location homeLocation, Location tpFromLocation) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.homeLocation = homeLocation;
        this.tpFromLocation = tpFromLocation;
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
     * Get the clan of the event
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the location of the clan home
     * @return the home location
     */
    public Location getHomeLocation() {
        return homeLocation;
    }

    /**
     * Get the location of the player before teleport
     * @return the location
     */
    public Location getTpFromLocation() {
        return tpFromLocation;
    }
}
