package wiiu.mavity.bmnw.mixin;

import net.minecraft.server.MinecraftServer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
	}
}