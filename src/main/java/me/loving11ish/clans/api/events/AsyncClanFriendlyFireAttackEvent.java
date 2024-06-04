package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanFriendlyFireAttackEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Player attackingPlayer;
    private final Player victimPlayer;
    private final Clan attackingClan;
    private final Clan victimClan;

    /**
     * Constructor for the AsyncClanFriendlyFireAttackEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param attackingPlayer player who is attacking
     * @param victimPlayer player who is being attacked
     * @param attackingClan clan of the attacking player
     * @param victimClan clan of the victim player
     */
    public AsyncClanFriendlyFireAttackEvent(boolean isAsync, Player createdBy, Player attackingPlayer, Player victimPlayer, Clan attackingClan, Clan victimClan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.attackingPlayer = attackingPlayer;
        this.victimPlayer = victimPlayer;
        this.attackingClan = attackingClan;
        this.victimClan = victimClan;
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
     * Get the attacking player
     * @return the player
     */
    public Player getAttackingPlayer() {
        return attackingPlayer;
    }

    /**
     * Get the victim player
     * @return the player
     */
    public Player getVictimPlayer() {
        return victimPlayer;
    }

    /**
     * Get the attacking clan
     * @return the clan
     */
    public Clan getAttackingClan() {
        return attackingClan;
    }

    /**
     * Get the victim clan
     * @return the clan
     */
    public Clan getVictimClan() {
        return victimClan;
    }
}
