package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntConsumer;

/**
 * Serializable version of {@link IntConsumer}.
 * 
 * @see IntConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntConsumer extends IntConsumer, Serializable {
    //nothing
}
