package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToIntBiFunction;

/**
 * Serializable version of {@link ToIntBiFunction}.
 * 
 * @param <T>
 *            the type of the first argument to the function
 * @param <U>
 *            the type of the second argument to the function
 * 
 * @see ToIntBiFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToIntBiFunction<T, U> extends ToIntBiFunction<T, U>, Serializable {
    //nothing
}
