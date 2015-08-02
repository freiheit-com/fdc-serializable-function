package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntFunction;

/**
 * Serializable version of {@link ToIntFunction}.
 * 
 * @param <T>
 *            the type of the input to the function
 * 
 * @see ToIntFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToIntFunction<T> extends ToIntFunction<T>, Serializable {
    //nothing
}
