package me.loving11ish.clans.api.models;

public interface ClanPlayer {

    public String getJavaUUID();

    public void setJavaUUID(String javaUUID);

    public String getLastPlayerName();

    public void setLastPlayerName(String lastPlayerName);

    public int getPointBalance();

    public void setPointBalance(int pointBalance);

    public boolean getCanChatSpy();

    public void setCanChatSpy(boolean canChatSpy);

    public boolean isBedrockPlayer();

    public void setBedrockPlayer(boolean bedrockPlayer);

    public String getBedrockUUID();

    public void setBedrockUUID(String bedrockUUID);
    
}
