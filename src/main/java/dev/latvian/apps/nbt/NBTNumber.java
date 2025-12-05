package dev.latvian.apps.nbt;

public interface NBTNumber extends NBTPrimitive {
	@Override
	default NBTNumber copy() {
		return this;
	}
}
