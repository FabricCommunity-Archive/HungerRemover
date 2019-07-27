package com.github.fabriccommunity.hungerremover.mixin;

import com.github.fabriccommunity.hungerremover.HungerRemoverMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class MixinItem {
    @Inject(at = @At("HEAD"), method = "getMaxUseTime", cancellable = true)
    private void onGetMaxUseTime(ItemStack itemStack, CallbackInfoReturnable<Integer> info) {
        if (HungerRemoverMod.getConfig().shouldInstantEat()) {
            if (itemStack.getItem().isFood()) {
                // Food items don't work with 0, so 1 is the next best thing.
                info.setReturnValue(1);
            }
        }
    }
}
