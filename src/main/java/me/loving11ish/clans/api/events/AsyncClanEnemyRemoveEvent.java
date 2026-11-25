package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Fired when one clan removes another as an enemy.
 */
public class AsyncClanEnemyRemoveEvent extends Event {

    /** Registered handlers for this event. */
    private static final HandlerList HANDLERS = new HandlerList();
    /** Player who removed the enemy. */
    private final Player createdBy;
    /** Clan removing the enemy. */
    private final Clan clan;
    /** Creator of the former enemy clan. */
    private final Player exEnemyClanCreatedBy;
    /** Former enemy clan. */
    private final Clan exEnemyClan;

    /**
     * Constructor for the AsyncClanEnemyRemoveEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan that is removing the enemy
     * @param exEnemyClanCreatedBy player who owns the enemy clan
     * @param exEnemyClan clan that is being removed as an enemy
     */
    public AsyncClanEnemyRemoveEvent(boolean isAsync, Player createdBy, Clan clan, Player exEnemyClanCreatedBy, Clan exEnemyClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.exEnemyClanCreatedBy = exEnemyClanCreatedBy;
        this.exEnemyClan = exEnemyClan;
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
     * Get the clan that is removing the enemy
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the player who owns the enemy clan
     * @return the player
     */
    public Player getExEnemyClanCreatedBy() {
        return exEnemyClanCreatedBy;
    }

    /**
     * Get the clan that is being removed as an enemy
     * @return the clan
     */
    public Clan getExEnemyClan() {
        return exEnemyClan;
    }
}
