package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import me.loving11ish.clans.api.models.ClanPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AsyncClanPointsAddedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan playerClan;
    private final ClanPlayer clanPlayer;
    private final int previousClanPlayerPointBalance;
    private final int newClanPlayerPointBalance;
    private final int depositPointValue;
    private final int previousClanPointBalance;
    private final int newClanPointBalance;

    /**
     * Constructor for the AsyncClanPointsAddedEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy the player who created the event
     * @param playerClan the clan of the player
     * @param clanPlayer the ClanPlayer who received the points
     * @param previousClanPlayerPointBalance the previous point balance of the ClanPlayer
     * @param newClanPlayerPointBalance the new point balance of the ClanPlayer
     * @param depositPointValue the value of the points added
     * @param previousClanPointBalance the previous point balance of the clan
     * @param newClanPointBalance the new point balance of the clan
     */
    public AsyncClanPointsAddedEvent(boolean isAsync, Player createdBy, Clan playerClan, ClanPlayer clanPlayer, int previousClanPlayerPointBalance, int newClanPlayerPointBalance, int depositPointValue, int previousClanPointBalance, int newClanPointBalance) {
        super(isAsync);
        this.createdBy = createdBy;
        this.playerClan = playerClan;
        this.clanPlayer = clanPlayer;
        this.previousClanPlayerPointBalance = previousClanPlayerPointBalance;
        this.newClanPlayerPointBalance = newClanPlayerPointBalance;
        this.depositPointValue = depositPointValue;
        this.previousClanPointBalance = previousClanPointBalance;
        this.newClanPointBalance = newClanPointBalance;
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
    public Clan getPlayerClan() {
        return playerClan;
    }

    /**
     * Get the ClanPlayer who received the points
     * @return the ClanPlayer
     */
    public ClanPlayer getClanPlayer() {
        return clanPlayer;
    }

    /**
     * Get the previous point balance of the ClanPlayer
     * @return the previous point balance
     */
    public int getPreviousClanPlayerPointBalance() {
        return previousClanPlayerPointBalance;
    }

    /**
     * Get the new point balance of the ClanPlayer
     * @return the new point balance
     */
    public int getNewClanPlayerPointBalance() {
        return newClanPlayerPointBalance;
    }

    /**
     * Get the value of the points added
     * @return the value of the points
     */
    public int getDepositPointValue() {
        return depositPointValue;
    }

    /**
     * Get the previous point balance of the clan
     * @return the previous point balance
     */
    public int getPreviousClanPointBalance() {
        return previousClanPointBalance;
    }

    /**
     * Get the new point balance of the clan
     * @return the new point balance
     */
    public int getNewClanPointBalance() {
        return newClanPointBalance;
    }
}
