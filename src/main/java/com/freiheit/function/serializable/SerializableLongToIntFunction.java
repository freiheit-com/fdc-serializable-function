package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongToIntFunction;

/**
 * Serializable version of {@link LongToIntFunction}.
 * 
 * @see LongToIntFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongToIntFunction extends LongToIntFunction, Serializable {
    //nothing
}
