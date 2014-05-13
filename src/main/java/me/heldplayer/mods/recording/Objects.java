
package me.heldplayer.mods.recording;

import net.specialattack.forge.core.ModInfo;

import org.apache.logging.log4j.Logger;

/**
 * ImRecording mod Objects
 * 
 */
public final class Objects {

    public static final String MOD_ID = "imrecording";
    public static final String MOD_NAME = "The \"I'm Recording\" Mod";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String MOD_CHANNEL = "ImRecording";
    public static final String CLIENT_PROXY = "me.heldplayer.mods.recording.client.ClientProxy";
    public static final String SERVER_PROXY = "me.heldplayer.mods.recording.CommonProxy";

    public static final ModInfo MOD_INFO = new ModInfo(Objects.MOD_ID, Objects.MOD_NAME);

    public static Logger log;

}