package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntToLongFunction;

/**
 * Serializable version of {@link IntToLongFunction}.
 * 
 * @see IntToLongFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntToLongFunction extends IntToLongFunction, Serializable {
    //nothing
}
