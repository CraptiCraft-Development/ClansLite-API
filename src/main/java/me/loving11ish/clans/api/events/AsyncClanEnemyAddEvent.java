package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanEnemyAddEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final Player enemyClanCreatedBy;
    private final Clan enemyClan;

    /**
     * Constructor for the AsyncClanEnemyAddEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan of the player
     * @param enemyClanCreatedBy player who owns the enemy clan
     * @param enemyClan enemy clan
     */
    public AsyncClanEnemyAddEvent(boolean isAsync, Player createdBy, Clan clan, Player enemyClanCreatedBy, Clan enemyClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.enemyClanCreatedBy = enemyClanCreatedBy;
        this.enemyClan = enemyClan;
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
     * Get the clan of the player
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the player who owns the enemy clan
     * @return the player
     */
    public Player getEnemyClanCreatedBy() {
        return enemyClanCreatedBy;
    }

    /**
     * Get the enemy clan
     * @return the enemy clan
     */
    public Clan getEnemyClan() {
        return enemyClan;
    }

}
