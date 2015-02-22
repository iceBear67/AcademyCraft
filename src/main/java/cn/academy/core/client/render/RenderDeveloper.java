/**
 * 
 */
package cn.academy.core.client.render;

import java.util.Random;

import net.minecraft.tileentity.TileEntity;
import cn.academy.core.block.dev.TileDeveloper;
import cn.academy.core.proxy.ACClientProps;
import cn.academy.core.proxy.ACModels;
import cn.liutils.api.render.model.TileEntityModelCustom;
import cn.liutils.template.client.render.block.RenderDirMultiModelled;

/**
 * @author WeathFolD
 *
 */
public class RenderDeveloper extends RenderDirMultiModelled {
	
	private static Random RNG = new Random();
	public RenderDeveloper() {
		super(new TileEntityModelCustom(ACModels.MDL_ABILITY_DEVELOPER));
		this.texture = ACClientProps.TEX_MDL_DEVELOPER;
		setScale(0.021F);
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4,
			double var6, float var8) {
		TileDeveloper td = (TileDeveloper) var1;
		super.renderTileEntityAt(var1, var2, var4, var6, var8);
	}

}
