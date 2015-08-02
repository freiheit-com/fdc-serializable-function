package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToLongBiFunction;

/**
 * Serializable version of {@link ToLongBiFunction}.
 * 
 * @param <T>
 *            the type of the first argument to the function
 * @param <U>
 *            the type of the second argument to the function
 * 
 * @see ToLongBiFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToLongBiFunction<T, U> extends ToLongBiFunction<T, U>, Serializable {
    //nothing
}
