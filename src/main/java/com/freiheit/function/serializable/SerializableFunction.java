package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.Function;

/**
 * Serializable version of {@link Function}.
 *
 * @param <T>
 *            the type of the input to the function
 * @param <R>
 *            the type of the result of the function
 * 
 * @see Function
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableFunction<T, R> extends Function<T, R>, Serializable {
    //nothing
}
