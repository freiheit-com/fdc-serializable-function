package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.BiFunction;

/**
 * Serializable version of {@link BiFunction}.
 * 
 * @param <T>
 *            the type of the first argument to the function
 * @param <U>
 *            the type of the second argument to the function
 * @param <R>
 *            the type of the result of the function
 * 
 * @see BiFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableBiFunction<T, U, R> extends BiFunction<T, U, R>, Serializable {
    //nothing
}
