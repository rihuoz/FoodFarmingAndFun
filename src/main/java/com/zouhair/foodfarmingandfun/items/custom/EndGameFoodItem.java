package com.zouhair.foodfarmingandfun.items.custom;



import com.mojang.datafixers.util.Pair;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;


public class EndGameFoodItem extends Item {

    public EndGameFoodItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        return eat(level, itemStack, entity);
    }

    public ItemStack eat(Level level, ItemStack itemStack, LivingEntity entity) {
            level.playSound((Player)null, entity.getX(), entity.getY(), entity.getZ()
                    , entity.getEatingSound(itemStack), SoundSource.NEUTRAL, 1.0F
                    , 1.0F + (level.random.nextFloat() - level.random.nextFloat()) * 0.4F);
            addEatEffect(itemStack, level, entity);

            entity.gameEvent(GameEvent.EAT);
        return itemStack;
    }

    private void addEatEffect(ItemStack itemStack, Level level, LivingEntity entity) {
        for(Pair<MobEffectInstance, Float> pair : itemStack.getFoodProperties(entity).getEffects()) {
                if (!level.isClientSide && pair.getFirst() != null && level.random.nextFloat() < pair.getSecond()) {
                    entity.addEffect(new MobEffectInstance(pair.getFirst()));
                }
            }
    }
}
// to do: actually give saturation and nutrition ^^