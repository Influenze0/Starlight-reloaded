package ca.spottedleaf.starlight.mixin.common.world;

import ca.spottedleaf.starlight.common.util.SaveUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ProtoChunk;
import net.minecraft.world.level.chunk.storage.SerializableChunkData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SerializableChunkData.class)
public abstract class ChunkSerializerMixin {

    /**
     * Overwrites vanilla's light data with our own.
     */
    @Inject(
            method = "write",
            at = @At("RETURN")
    )
    private void saveLightHook(final CallbackInfoReturnable<CompoundTag> cir) {
        
    }

    /**
     * Loads our light data into the returned chunk object from the tag.
     */
    @Inject(
            method = "read",
            at = @At("RETURN")
    )
    private void loadLightHook(
            CallbackInfoReturnable<ProtoChunk> cir) {

    }
}