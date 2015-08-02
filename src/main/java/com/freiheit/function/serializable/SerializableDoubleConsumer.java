package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleConsumer;

/**
 * Serializable version of {@link DoubleConsumer}.
 * 
 * @see DoubleConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleConsumer extends DoubleConsumer, Serializable {
    //nothing
}
