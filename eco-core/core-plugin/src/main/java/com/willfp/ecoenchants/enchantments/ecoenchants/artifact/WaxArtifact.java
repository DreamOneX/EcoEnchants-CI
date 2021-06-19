package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.eco.core.Prerequisite;
import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class WaxArtifact extends Artifact {
    public WaxArtifact() {
        super(
                "wax_artifact",
                Prerequisite.v1_17
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.WAX_OFF;
    }
}