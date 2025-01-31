package me.loving11ish.clans.api;

import me.loving11ish.clans.api.models.Clan;
import me.loving11ish.clans.api.models.ClanPlayer;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * This is the main API class for ClansLite.
 * This class contains all the methods that can be used to interact with the plugin.
 */
@SuppressWarnings("unused")
public interface ClansLiteAPI {

    /**
     *
     * @return Returns the instance of the ClansLiteAPI.
     */
    static ClansLiteAPI getInstance() {
        RegisteredServiceProvider<ClansLiteAPI> registration = Bukkit.getServicesManager().getRegistration(ClansLiteAPI.class);
        if (registration == null) {
            return null;
        }
        return registration.getProvider();
    }

    /**
     * Refreshes the clan names and prefixes lists.
     * <p>
     * This method should be called after any changes to the Clans or UserMap HashMaps.
     * This method should be called after any changes to ANY YML file changes.
     */
    void refreshData();

    /**
     *
     * @return Returns true if the plugin was enabled successfully, otherwise returns false.
     */
    boolean isPluginEnabled();

    /**
     *
     * @return Returns a string of text that contains the full server package.
     */
    String getServerPackage();

    /**
     *
     * @return Returns an integer that is the base major server version.
     */
    int getMajorServerVersion();

    /**
     *
     * @return Returns `true` if the server or network is able to connect to the Mojang auth servers. Otherwise, returns `false`.
     *
     */
    boolean isServerRunningOnline();

    /**
     *
     * @return Returns `true` if your current ClansLite plugin version does NOT mach the latest version listed on SpigotMC.
     */
    boolean isClansLitePluginUpdateAvailable();

    /**
     *
     * @return Returns the URL of the development build repository for ClansLite.
     */
    String getClansLiteDevelopmentBuildRepository();

    /**
     *
     * @return Returns a HashMap of all connected Bedrock players with a key of the Player and a value of their Java UUID.
     */
    HashMap<Player, String> getConnectedBedrockPlayers();

    /**
     *
     * @return Returns a HashMap of all stored Clans.
     */
    HashMap<UUID, Clan> getAllClans();

    /**
     *
     * @return Returns a HashMap of all stored ClanPlayers.
     */
    HashMap<UUID, ClanPlayer> getAllClanPlayers();

    /**
     * THIS METHOD IS NOT RECOMMENDED FOR USE ON LARGE SERVERS.
     * Please use {@link #getTopClansByClanPointsCache()} instead.
     *
     * @param maxListSize The maximum size of the list of Clans to return.
     * @return Returns a list of Clans sorted by clan points.
     */
    List<Clan> getTopClansByClanPointsOnDemand(int maxListSize);

    /**
     * The returned list is cached and updated asynchronously every 10 minutes.
     *
     * @return Returns a list of Clans sorted by clan points.
     */
    List<Clan> getTopClansByClanPointsCache();

    /**
     * THIS METHOD IS NOT RECOMMENDED FOR USE ON LARGE SERVERS.
     * Please use {@link #getTopClanPlayersByPlayerPointsCache()} instead.
     *
     * @param maxListSize The maximum size of the list of ClanPlayers to return.
     * @return Returns a list of ClanPlayers sorted by clan points.
     */
    List<ClanPlayer> getTopClanPlayersByClanPointsOnDemand(int maxListSize);

    /**
     * The returned list is cached and updated asynchronously every 10 minutes.
     *
     * @return Returns a list of ClanPlayers sorted by Player points.
     */
    List<ClanPlayer> getTopClanPlayersByPlayerPointsCache();

    /**
     *
     * @param player The Bukkit Player object to get a ClanPlayer from.
     * @return Returns a ClanPlayer object or null if not found.
     */
    ClanPlayer getClanPlayerByBukkitPlayer(Player player);

    /**
     *
     * @param offlinePlayer The Bukkit OfflinePlayer object to get a ClanPlayer from.
     * @return Returns a ClanPlayer object or null if not found.
     */
    ClanPlayer getClanPlayerByBukkitOfflinePlayer(OfflinePlayer offlinePlayer);

    /**
     * THIS WILL RETURN NULL IF THE PLAYER HAS NEVER JOINED THE SERVER BEFORE.
     * THIS WILL CAUSE AN ERROR IF THE PLAYER CHANGED THEIR NAME AND HAS NOT JOINED THE SERVER SINCE.
     * THIS METHOD IS NOT RECOMMENDED TO BE RELIED ON.
     * Please use {@link #getBukkitOfflinePlayerByUUID(UUID)} instead.
     *
     * @param lastKnownName The last known name of the player to get a Bukkit OfflinePlayer from.
     * @return Returns a Bukkit OfflinePlayer object or null if not found.
     */
    OfflinePlayer getBukkitOfflinePlayerByLastKnownName(String lastKnownName);

    /**
     *
     * @param uuid The UUID of the player to get a Bukkit OfflinePlayer from.
     * @return Returns a Bukkit OfflinePlayer object or null if not found.
     */
    OfflinePlayer getBukkitOfflinePlayerByUUID(UUID uuid);

    /**
     * This method will only return a clan if the player is a member of a clan and NOT the clan owner.
     *
     * @param player The Bukkit Player object to get a Clan from.
     * @return Returns a Clan object or null if not found.
     */
    Clan getClanByBukkitPlayer(Player player);

    /**
     * This method will only return a clan if the offline player is a member of a clan and NOT the clan owner.
     *
     * @param offlinePlayer The Bukkit OfflinePlayer object to get a Clan from.
     * @return Returns a Clan object or null if not found.
     */
    Clan getClanByBukkitOfflinePlayer(OfflinePlayer offlinePlayer);

    /**
     * This method will only return a clan if the player is the owner of a clan.
     *
     * @param player The Bukkit Player object to get a Clan from.
     * @return Returns a Clan object or null if not found.
     */
    Clan getClanByBukkitPlayerOwner(Player player);

    /**
     * This method will only return a clan if the offline player is the owner of a clan.
     *
     * @param offlinePlayer The Bukkit OfflinePlayer object to get a Clan from.
     * @return Returns a Clan object or null if not found.
     */
    Clan getClanByBukkitOfflinePlayerOwner(OfflinePlayer offlinePlayer);

    /**
     * This method will only return a clan if the clan name is found.
     *
     * @param clanName The name of the clan to get a Clan from.
     * @return Returns a Clan object or null if not found.
     */
    Clan getClanByClanName(String clanName);

    /**
     * This method will perform multiple checks to see if the new clan is valid and can be created.
     * This method will create a Clan object and add it to the HashMap of Clans.
     * This method will fire an AsyncClanCreateEvent upon successful Clan creation.
     *
     * @param player The Bukkit Player object to create a Clan from.
     * @param clanName The name of the clan to create. (This cannot be changed later and cannot contain color codes)
     * @return Returns a Clan object.
     */
    Clan createClan(Player player, String clanName);

    /**
     *
     * @param player The Bukkit Player object to delete a Clan from.
     * @return Returns true if the Clan was deleted successfully, otherwise returns false.
     * @throws IOException Throws an IOException if the Clan could not be deleted.
     */
    boolean deleteClan(Player player) throws IOException;

    /**
     * This method will perform multiple checks to see if the new prefix is valid and can be set.
     * This method will fire an AsyncClanPrefixChangeEvent upon successful prefix change.
     *
     * @param player The Bukkit Player object to get the clan from.
     * @param prefix The new prefix to set for the clan.
     */
    void setClanPrefix(Player player, String prefix);

    /**
     * This method will perform multiple checks to see if the player is not already a member of a clan or a clan owner.
     *
     * @param clan The Clan object to add a member to.
     * @param player The Bukkit Player object to add to the Clan.
     * @return Returns true if the player was added to the Clan successfully, otherwise returns false.
     */
    boolean addClanMember(Clan clan, Player player);

    /**
     * This method will perform multiple checks to see if the player is in a clan and not a clan owner.
     *
     * @param clan The Clan object to remove a member from.
     * @param player The Bukkit Player object to remove from the Clan.
     * @return Returns true if the player was removed from the Clan successfully, otherwise returns false.
     */
    boolean removeClanMember(Clan clan, Player player);

    /**
     * This method will perform multiple checks to see if the player is in a clan and not a clan owner.
     *
     * @param clan The Clan object to remove a member from.
     * @param offlinePlayer The Bukkit OfflinePlayer object to remove from the Clan.
     * @return Returns true if the player was removed from the Clan successfully, otherwise returns false.
     */
    boolean removeOfflineClanMember(Clan clan, OfflinePlayer offlinePlayer);

}
