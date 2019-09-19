package com.raoulvdberge.refinedstorage.proxy;

import com.raoulvdberge.refinedstorage.render.IModelRegistration;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;

import java.util.function.Function;
import java.util.function.Supplier;

public class ProxyClient extends ProxyCommon implements IModelRegistration {
    @Override
    public void addBakedModelOverride(ResourceLocation resource, Function<IBakedModel, IBakedModel> override) {

    }

    @Override
    public void setModel(Block block, int meta, ModelResourceLocation resource) {

    }

    @Override
    public void setModel(Item item, int meta, ModelResourceLocation resource) {

    }

    @Override
    public void setModelVariants(Item item, ResourceLocation... variants) {

    }

    @Override
    public void addModelLoader(Supplier<ICustomModelLoader> modelLoader) {

    }

    @Override
    public <T extends TileEntity> void setTesr(Class<T> tile, TileEntityRenderer<T> tesr) {

    }

    @Override
    public void addItemColor(Item item, IItemColor itemColor) {

    }

    /*private List<Pair<Item, IItemColor>> itemColors = new LinkedList<>();

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);

        MinecraftForge.EVENT_BUS.register(new BlockHighlightListener());
        MinecraftForge.EVENT_BUS.register(new KeyInputListener());

        RSItems.PATTERN.setTileEntityItemStackRenderer(new TileEntityItemStackRendererPattern());
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        RSKeyBindings.init();

        itemColors.forEach(p -> Minecraft.getMinecraft().getItemColors().registerItemColorHandler(p.getRight(), p.getKey()));
    }

    @Override
    public void addModelLoader(Supplier<ICustomModelLoader> modelLoader) {
        ModelLoaderRegistry.registerLoader(modelLoader.get());
    }

    @Override
    public void setTesr(Class<? extends TileEntity> tile, TileEntitySpecialRenderer tesr) {
        ClientRegistry.bindTileEntitySpecialRenderer(tile, tesr);
    }

    @Override
    public void addItemColor(Item item, IItemColor itemColor) {
        itemColors.add(Pair.of(item, itemColor)); // ItemColors is only available in init.
    }*/
}
