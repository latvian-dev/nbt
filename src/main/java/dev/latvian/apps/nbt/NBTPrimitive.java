package dev.latvian.apps.nbt;

public interface NBTPrimitive extends NBTTag {
	@Override
	default NBTPrimitive copy() {
		return this;
	}
}
