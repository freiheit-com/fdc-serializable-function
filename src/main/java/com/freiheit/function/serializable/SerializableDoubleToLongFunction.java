package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleToLongFunction;

/**
 * Serializable version of {@link DoubleToLongFunction}.
 * 
 * @see DoubleToLongFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleToLongFunction extends DoubleToLongFunction, Serializable {
    //nothing
}
