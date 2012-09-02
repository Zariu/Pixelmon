package pixelmon.entities.pixelmon;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.src.DamageSource;
import net.minecraft.src.ModelBase;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public abstract class Entity4Textures extends Entity3HasStats {
	public float scale = 1F;
	public float maxScale = 1.25F;

	public Entity4Textures(World par1World) {
		super(par1World);
		dataWatcher.addObject(20, (short) 0); // shiny
		dataWatcher.addObject(21, (short) 0); // roasted
	}

	protected void init(String name) {
		super.init(name);
		if ((new Random()).nextFloat() < 1 / 8192f) {
			System.out.println("Shiny " + getName() + " spawned");
			dataWatcher.updateObject(20, (short) 1);
		}
	}

	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2) {
		if (par1DamageSource.fireDamage())
			dataWatcher.updateObject(21, (short) 1);
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public String getTexture() {
		if (dataWatcher.getWatchableObjectShort(20) == 1
				&& Minecraft.getMinecraft().renderEngine.texturePack.getSelectedTexturePack().getResourceAsStream("/pixelmon/texture/pokemon-shiny/shiny" + getName().toLowerCase() + ".png") != null)
			return "/pixelmon/texture/pokemon-shiny/shiny" + getName().toLowerCase() + ".png";
		else if (dataWatcher.getWatchableObjectShort(21) == 1
				&& Minecraft.getMinecraft().renderEngine.texturePack.getSelectedTexturePack().getResourceAsStream("/pixelmon/texture/pokemon-roasted/roasted" + getName().toLowerCase() + ".png") != null)
			return "/pixelmon/texture/pokemon-roasted/roasted" + getName().toLowerCase() + ".png";
		else
			return "/pixelmon/texture/pokemon/" + getName().toLowerCase() + ".png";
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);
		nbt.setBoolean("IsShiny", dataWatcher.getWatchableObjectShort(20) == 1);
		nbt.setBoolean("IsRoasted", dataWatcher.getWatchableObjectShort(21) == 1);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);
		dataWatcher.updateObject(20, nbt.getBoolean("IsShiny") ? 1 : 0);
		dataWatcher.updateObject(21, nbt.getBoolean("IsRoasted") ? 1 : 0);
	}
}