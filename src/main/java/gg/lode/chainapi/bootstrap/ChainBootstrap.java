package gg.lode.chainapi.bootstrap;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Lifecycle contract the runtime-loaded Chain implementation fulfils. The public
 * {@code Chain-Loader} jar is the actual plugin: it downloads the implementation, creates its
 * entry class and passes each Bukkit lifecycle call on, with itself as the host.
 *
 * <p>Implementations need a public no-arg constructor so the loader can create them.
 */
public interface ChainBootstrap {
    void onLoad(JavaPlugin host);
    void onEnable(JavaPlugin host);
    void onDisable(JavaPlugin host);
}
