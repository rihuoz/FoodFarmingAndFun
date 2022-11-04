package com.zouhair.foodfarmingandfun.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class RegenerationBlock extends Block {

    public RegenerationBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if(level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60 * 20));
            player.addEffect(new MobEffectInstance(randomMobEffects(), 20 * 20));
        }

        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity ){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2 * 20));
        }
        super.stepOn(level, pos, state, entity);
    }

    private MobEffect randomMobEffects(){
        MobEffect toReturn = MobEffects.HUNGER;
        int randomInt = (int)(Math.random() * 3);
        switch (randomInt){
            case 0: toReturn = MobEffects.BLINDNESS; break;
            case 1: toReturn = MobEffects.DIG_SLOWDOWN; break;
            case 2: toReturn = MobEffects.HUNGER; break;
        }
        return toReturn;
    }
}
