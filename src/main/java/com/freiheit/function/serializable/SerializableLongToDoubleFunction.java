package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongToDoubleFunction;

/**
 * Serializable version of {@link LongToDoubleFunction}.
 * 
 * @see LongToDoubleFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongToDoubleFunction extends LongToDoubleFunction, Serializable {
    //nothing
}
