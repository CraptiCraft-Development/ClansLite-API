package me.loving11ish.clans.api.models;

/**
 * This contains all the `PLOJO` (Plain Old Java Object) methods for the ClanPlayer object.
 * <p>
 * This object is used to store all the information about a ClansLite ClanPlayer.
 */
public interface ClanPlayer {

    /**
     * @return Returns the UUID string of the player.
     */
    String getJavaUUID();

    /**
     * @param javaUUID The UUID string of the player.
     */
    void setJavaUUID(String javaUUID);

    /**
     * This value is not always accurate, as the player can change their name.
     * <p>
     * Do not rely on this value for anything important.
     * <p>
     * @return Returns the name of the player.
     */
    String getLastPlayerName();

    /**
     * @param lastPlayerName The latest known name of the player.
     */
    void setLastPlayerName(String lastPlayerName);

    /**
     * @return Returns the point balance of the player.
     */
    int getPointBalance();

    /**
     * @param pointBalance The new point balance of the player.
     */
    void setPointBalance(int pointBalance);

    /**
     * @return Returns whether the player can see chat spy messages.
     */
    boolean getCanChatSpy();

    /**
     * @param canChatSpy Whether the player can see chat spy messages.
     */
    void setCanChatSpy(boolean canChatSpy);

    /**
     * This value can only ever be set to `true` if the Floodgate plugin is installed.
     * <p>
     * @return Returns whether the player is a bedrock player.
     */
    boolean isBedrockPlayer();

    /**
     * This value can only ever be set to `true` if the Floodgate plugin is installed.
     * <p>
     * @param bedrockPlayer Whether the player is a bedrock player.
     */
    void setBedrockPlayer(boolean bedrockPlayer);

    /**
     * This value can only ever be set if the player is a bedrock player.
     * <p>
     * @return Returns the XUID string of the bedrock player.
     */
    String getBedrockUUID();

    /**
     * This value can only ever be set if the player is a bedrock player.
     * <p>
     * @param bedrockUUID The XUID string of the bedrock player.
     */
    void setBedrockUUID(String bedrockUUID);
    
}
