package me.sashie.skdragon.effects;

import me.sashie.skdragon.effects.properties.ExtraProperty;
import me.sashie.skdragon.effects.properties.IExtra;
import me.sashie.skdragon.effects.properties.IRadius;
import me.sashie.skdragon.effects.properties.RadiusProperty;
import me.sashie.skdragon.util.EffectUtils;

public abstract class SimpleRadiusValueEffect extends SimpleEffect implements IRadius, IExtra {

	private RadiusProperty radiusProperty;
	private ExtraProperty extraProperty;

	public SimpleRadiusValueEffect() {
		radiusProperty = new RadiusProperty();
		extraProperty = new ExtraProperty();
//		this.initRadius(1.5f);
	}

	@Override
	public EffectProperty[] acceptProperties() {
		return EffectUtils.array( EffectProperty.RADIUS, EffectProperty.EXTRA);
	}

	@Override
	public RadiusProperty getRadiusProperty() {
		return radiusProperty;
	}

	@Override
	public ExtraProperty getExtraProperty() {
		return extraProperty;
	}
}
