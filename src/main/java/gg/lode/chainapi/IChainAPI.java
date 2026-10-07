package gg.lode.chainapi;

public interface IChainAPI {

    IChainManager getChainManager();

    void setMaxDistance(int maxDistance);

    int getMaxDistance();

    /** How chains are currently drawn. */
    ChainRenderMode getRenderMode();

    /** Switches every chain to this mode from the next tick on, and saves it to the config. */
    void setRenderMode(ChainRenderMode mode);

    /**
     * Whether chains collide with blocks. When on, a chain can wrap around things and holds its
     * ends back once the wrap uses up its length. Only applies to {@link ChainRenderMode#CHAIN}.
     */
    boolean isHyperRealistic();

    /** Turns block collision for chains on or off, from the next tick, and saves it to the config. */
    void setHyperRealistic(boolean hyperRealistic);

    /** Whether every entity chained to one that dies is killed along with it. */
    boolean isDieTogether();

    /** Turns dying together on or off, and saves it to the config. */
    void setDieTogether(boolean dieTogether);

    /** The language Chain speaks: a locale code such as {@code ru_ru}, or {@code auto} for each player's own. */
    String getLanguage();

    /** Sets the language, a locale code or {@code auto}, and saves it to the config. */
    void setLanguage(String language);

}
