package amidst.map.layer;

import amidst.fragment.constructor.DummyConstructor;
import amidst.fragment.drawer.WorldObjectDrawer;
import amidst.fragment.loader.WorldObjectLoader;
import amidst.map.Map;
import amidst.minecraft.world.object.WorldObjectProducer;
import amidst.preferences.PrefModel;

public class WorldObjectLayer extends Layer {
	public WorldObjectLayer(LayerType layerType,
			PrefModel<Boolean> isVisiblePreference, Map map,
			WorldObjectProducer producer) {
		super(layerType, isVisiblePreference, new WorldObjectDrawer(map,
				layerType), new DummyConstructor(), new WorldObjectLoader(
				layerType, producer));
	}
}
