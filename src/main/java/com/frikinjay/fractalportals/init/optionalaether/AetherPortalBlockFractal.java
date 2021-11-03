package com.frikinjay.fractalportals.init.optionalaether;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.id.aether.util.AetherSoundEvents;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.kyrptonaught.customportalapi.interfaces.EntityInCustomPortal;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class AetherPortalBlockFractal extends CustomPortalBlock {
    public AetherPortalBlockFractal(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if(!(MinecraftClient.getInstance().player instanceof EntityInCustomPortal entity && entity.didTeleport()) && random.nextInt(200) == 0){
            world.getProfiler().push("portal");
            world.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, AetherSoundEvents.BLOCK_AETHER_PORTAL_AMBIENT, SoundCategory.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
            world.getProfiler().pop();
        }

        double d = (double) pos.getX() + random.nextDouble();
        double e = (double) pos.getY() + random.nextDouble();
        double f = (double) pos.getZ() + random.nextDouble();
        double g = ((double) random.nextFloat() - 0.5D) * 0.5D;
        double h = ((double) random.nextFloat() - 0.5D) * 0.5D;
        double j = ((double) random.nextFloat() - 0.5D) * 0.5D;
        int k = random.nextInt(2) * 2 - 1;
        if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
            d = (double) pos.getX() + 0.5D + 0.25D * (double) k;
            g = random.nextFloat() * 2.0F * (float) k;
        } else {
            f = (double) pos.getZ() + 0.5D + 0.25D * (double) k;
            j = random.nextFloat() * 2.0F * (float) k;
        }
        if (world.getRandom().nextInt(6) != 0) world.addParticle(ParticleTypes.DRIPPING_WATER, d, e, f, g, h, j);
        else world.addParticle(ParticleTypes.CLOUD, d, e, f, 0, 0, 0);
    }
}
