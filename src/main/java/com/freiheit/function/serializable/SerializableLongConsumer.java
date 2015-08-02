package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongConsumer;

/**
 * Serializable version of {@link LongConsumer}.
 * 
 * @see LongConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongConsumer extends LongConsumer, Serializable {
    //nothing
}
