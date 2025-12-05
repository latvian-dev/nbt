package dev.latvian.apps.nbt;

import java.io.DataOutput;
import java.io.IOException;

public interface NBTTag {
	NBTType getType();

	void write(DataOutput out) throws IOException;

	default NBTTag copy() {
		return this;
	}

	default NBTTag unwrap() {
		return this;
	}

	default void toString(StringBuilder builder) {
		builder.append(this);
	}
}
