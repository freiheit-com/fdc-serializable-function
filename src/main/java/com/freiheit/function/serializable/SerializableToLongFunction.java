package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToLongFunction;

/**
 * Serializable version of {@link ToLongFunction}.
 * 
 * @param <T>
 *            the type of the input to the function
 * 
 * @see ToLongFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToLongFunction<T> extends ToLongFunction<T>, Serializable {
    //nothing
}
