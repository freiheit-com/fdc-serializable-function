package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongFunction;

/**
 * Serializable version of {@link LongFunction}.
 * 
 * @param <R>
 *            the type of the result of the function
 * 
 * @see LongFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongFunction<R> extends LongFunction<R>, Serializable {
    //nothing
}
