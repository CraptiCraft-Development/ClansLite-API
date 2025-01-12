package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AsyncClanHomePreTeleportEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    @Nullable
    private final Player createdBy;
    @Nullable
    private final Clan clan;
    private boolean isCancelled;

    /**
     * Constructor for the AsyncClanHomePreTeleportEvent
     *
     * @param isAsync is the event async (always true when properly triggered by ClansLite and contains the player and clan)
     * @param createdBy player who created the event
     * @param clan clan of the event
     */
    public AsyncClanHomePreTeleportEvent(boolean isAsync, @Nullable Player createdBy, @Nullable Clan clan) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
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
    public @Nullable Player getCreatedBy() {
        return createdBy;
    }

    /**
     * Get the clan of the event
     * @return the clan
     */
    public @Nullable Clan getClan() {
        return clan;
    }

    /**
     * If the event is cancelled then the player will not be teleported to the clan home
     * @return the cancellation state
     */
    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    /**
     * Set the event to cancelled to prevent the player from being teleported to the clan home
     * @param cancel the cancellation state
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }
}
