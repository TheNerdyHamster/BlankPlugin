package net.hamsterapps.spigot.blankplugin.utils;

import net.md_5.bungee.api.ChatColor;

public class Utils {
  public static String color(String msg) {
    return ChatColor.translateAlternateColorCodes('&', msg);
  }
}