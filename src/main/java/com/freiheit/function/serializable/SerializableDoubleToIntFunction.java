package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleToIntFunction;

/**
 * Serializable version of {@link DoubleToIntFunction}.
 * 
 * @see DoubleToIntFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleToIntFunction extends DoubleToIntFunction, Serializable {
    //nothing
}
