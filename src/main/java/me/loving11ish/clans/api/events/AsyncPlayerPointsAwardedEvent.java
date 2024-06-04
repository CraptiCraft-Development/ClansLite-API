package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AsyncPlayerPointsAwardedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Player killer;
    private final Player victim;
    @Nullable
    private final Clan killerClan;
    @Nullable
    private final Clan victimClan;
    private final int pointValue;
    private final boolean isEnemyPointReward;

    /**
     * Constructor for the AsyncPlayerPointsAwardedEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy the player who created the event
     * @param killer the player who killed the victim
     * @param victim the player who was killed
     * @param killerClan the clan of the killer (null if not in a clan)
     * @param victimClan the clan of the victim (null if not in a clan)
     * @param pointValue the value of the points awarded
     * @param isEnemyPointReward is the point reward for killing an enemy
     */
    public AsyncPlayerPointsAwardedEvent(boolean isAsync, Player createdBy, Player killer, Player victim, @Nullable Clan killerClan, @Nullable Clan victimClan, int pointValue, boolean isEnemyPointReward) {
        super(isAsync);
        this.createdBy = createdBy;
        this.killer = killer;
        this.victim = victim;
        this.killerClan = killerClan;
        this.victimClan = victimClan;
        this.pointValue = pointValue;
        this.isEnemyPointReward = isEnemyPointReward;
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
     * Get the player who killed the victim
     * @return the player
     */
    public Player getKiller() {
        return killer;
    }

    /**
     * Get the player who was killed
     * @return the player
     */
    public Player getVictim() {
        return victim;
    }

    /**
     * Get the clan of the killer (null if not in a clan)
     * @return the clan of the killer
     */
    @Nullable
    public Clan getKillerClan() {
        return killerClan;
    }

    /**
     * Get the clan of the victim (null if not in a clan)
     * @return the clan of the victim
     */
    @Nullable
    public Clan getVictimClan() {
        return victimClan;
    }

    /**
     * Get the value of the points awarded
     * @return the point value
     */
    public int getPointValue() {
        return pointValue;
    }

    /**
     * Check if the point reward is for killing an enemy
     * @return true if the point reward is for killing an enemy
     */
    public boolean isEnemyPointReward() {
        return isEnemyPointReward;
    }
}
