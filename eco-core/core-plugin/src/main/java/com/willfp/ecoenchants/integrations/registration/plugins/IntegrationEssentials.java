package com.willfp.ecoenchants.integrations.registration.plugins;

import com.earth2me.essentials.Enchantments;
import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.EcoEnchants;
import com.willfp.ecoenchants.integrations.registration.RegistrationWrapper;
import org.apache.commons.lang.reflect.FieldUtils;
import org.bukkit.enchantments.Enchantment;

import java.util.Map;

public class IntegrationEssentials implements RegistrationWrapper {
    @Override
    public void registerAllEnchantments() {
        for (EcoEnchant enchantment : EcoEnchants.values()) {
            Enchantments.registerEnchantment(enchantment.getKey().getKey(), enchantment);
            Enchantments.registerAlias(enchantment.getPermissionName(), enchantment);
        }
    }

    @Override
    public String getPluginName() {
        return "Essentials";
    }
}
