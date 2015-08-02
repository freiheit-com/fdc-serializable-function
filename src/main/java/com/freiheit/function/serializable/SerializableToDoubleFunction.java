package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToDoubleFunction;

/**
 * Serializable version of {@link ToDoubleFunction}.
 * 
 * @param <T>
 *            the type of the input to the function
 * 
 * @see ToDoubleFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToDoubleFunction<T> extends ToDoubleFunction<T>, Serializable {
    //nothing
}
