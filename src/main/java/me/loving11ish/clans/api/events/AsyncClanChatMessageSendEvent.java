package me.loving11ish.clans.api.events;

import me.loving11ish.clans.api.models.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AsyncClanChatMessageSendEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player createdBy;
    private final Clan clan;
    private final String prefix;
    private final String message;
    private final ArrayList<String> recipients;

    /**
     * Constructor for the AsyncClanChatMessageSendEvent
     *
     * @param isAsync is the event async (always true when triggered by ClansLite)
     * @param createdBy player who created the event
     * @param clan clan of the player
     * @param prefix prefix of the clan
     * @param message message sent
     * @param recipients recipients of the message
     */
    public AsyncClanChatMessageSendEvent(boolean isAsync, Player createdBy, Clan clan, String prefix, String message, ArrayList<String> recipients) {
        super(isAsync);
        this.createdBy = createdBy;
        this.clan = clan;
        this.prefix = prefix;
        this.message = message;
        this.recipients = recipients;
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
     * Get the clan of the player
     * @return the clan
     */
    public Clan getClan() {
        return clan;
    }

    /**
     * Get the prefix of the clan
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Get the message sent
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Get the recipients of the message
     * @return the recipients (list of players as strings)
     */
    public ArrayList<String> getRecipients() {
        return recipients;
    }
}
